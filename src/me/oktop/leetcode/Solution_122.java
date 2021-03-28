package me.oktop.leetcode;

public class Solution_122 {
    public int maxProfit(int[] prices) {
        int current = prices[0];
        int money = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price > current) {
                money += price - current;
            }
            current = price;
        }
        return money;
    }

    public static void main(String[] args) {
        System.out.println(new Solution_122().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(new Solution_122().maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(new Solution_122().maxProfit(new int[]{7,6,5,4,3,1}));
    }
}
