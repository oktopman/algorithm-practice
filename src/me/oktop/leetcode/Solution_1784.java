package me.oktop.leetcode;

public class Solution_1784 {
    public boolean checkOnesSegment(String s) {
        if (s.length() == 1 && s.charAt(0) == '1') {
            return true;
        } else if (s.length() == 1 && s.charAt(0) == '0') {
            return false;
        }

        if (s.length() == 2 && s.charAt(1) == '1') {
            return true;
        } else if (s.length() == 2 && s.charAt(1) == '0') {
            return false;
        }

        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        boolean b = new Solution_1784().checkOnesSegment("1001");
//        boolean b = new Solution_1784().checkOnesSegment("110");
        boolean b = new Solution_1784().checkOnesSegment("10");
        System.out.println(b);
        /*
        10
        1
        1110


        101
         */
    }
}
