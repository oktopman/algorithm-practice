package me.oktop.level1;

public class StringCompression {

    public int solution(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int result = s.length();

        for (int i = 1; i < s.length(); i++) {
            int compression = compress(s, i).length();
            if (result > compression) {
                result = compression;
            }
        }
        return result;
    }

    public String compress(String s, int length) {
        String unit = s.substring(0, length);
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (int i = length; i < s.length(); i = i + length) {
            String substring = s.substring(i, Math.min(i + length, s.length()));
            if (unit.equals(substring)) {
                count++;
            } else {
                result.append(count == 1 ? "" : count).append(unit);
                count = 1;
                unit = substring;
            }
        }
        result.append(count == 1 ? "" : count).append(unit);
        return result.toString();
    }

    public static void main(String[] args) {
        new StringCompression().solution("aabbaccc");

    }

}
