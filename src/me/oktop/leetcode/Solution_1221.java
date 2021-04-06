package me.oktop.leetcode;

public class Solution_1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int num = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                num++;
            } else {
                num--;
            }
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}
