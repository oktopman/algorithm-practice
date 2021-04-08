package me.oktop.leetcode;

public class Solution_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            return numBottles;
        }
        int maximum = numBottles;
        int empty = numBottles;
        boolean isTrue = true;

        while (isTrue) {
            if (empty >= numExchange) {
                int fullEmpty = empty / numExchange;
                maximum += fullEmpty;
//                empty %= numExchange;
                empty = (empty % numExchange) + fullEmpty;
                continue;
            }
            isTrue = false;

        }
        return maximum;
    }

    public static void main(String[] args) {
//        int i = new Solution_1518().numWaterBottles(9, 3);
//        int i = new Solution_1518().numWaterBottles(15, 4);
//        int i = new Solution_1518().numWaterBottles(5, 5);
        int i = new Solution_1518().numWaterBottles(2,3);
        System.out.println(i);
    }
}
