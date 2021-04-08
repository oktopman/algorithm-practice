package me.oktop.leetcode;

public class Solution_1716 {
    public int totalMoney(int n) {
        int sum = 0;
        int day = 1;
        int week = 0;
        for (int i = 0; i < n; i++) {
            if (day == 8) {
                day = 1;
                week++;
            }
            sum += week + day;
            day++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = new Solution_1716().totalMoney(20);
        System.out.println(i);
    }
}
