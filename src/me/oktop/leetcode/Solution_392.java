package me.oktop.leetcode;

public class Solution_392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int index = 0;
        boolean output = false;
        for (int i = 0; i < s.length(); i++) {
            output = false;
            char current = s.charAt(i);
            for (int j = index; j < t.length(); j++) {
                if (t.charAt(j) == current) {
                    index = ++j;
                    output = true;
                    break;
                }
            }
            if (!output) {
                return false;
            }
        }
        return output;
    }

    public static void main(String[] args) {
//        boolean subsequence = new Solution_392().isSubsequence("abc", "ahbgdc");
//        boolean subsequence = new Solution_392().isSubsequence("axc", "ahbgdc");
//        boolean subsequence = new Solution_392().isSubsequence("aaaaaa", "bbaaaa");
//        System.out.println(subsequence);
        System.out.println("".length());
    }

}
