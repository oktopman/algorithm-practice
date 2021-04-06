package me.oktop.leetcode;

public class Solution_1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0; // 홀수
        int even = 0; // 짝수
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (odd > even) {
            return even;
        } else if (odd < even) {
            return odd;
        } else {
            return odd;
        }
    }

}
