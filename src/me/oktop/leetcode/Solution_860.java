package me.oktop.leetcode;

public class Solution_860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                }
                ten++;
                five--;
            } else {
                if (ten >= 1 && five >= 1) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        boolean b = new Solution_860().lemonadeChange(new int[]{5, 5, 5, 10, 20});
//        boolean b = new Solution_860().lemonadeChange(new int[]{5, 5, 10});
//        boolean b = new Solution_860().lemonadeChange(new int[]{10, 10});
//        boolean b = new Solution_860().lemonadeChange(new int[]{5,5,10,10,20});
        boolean b = new Solution_860().lemonadeChange(new int[]{5, 5, 5, 10, 5, 5, 10, 20, 20, 20});
//        boolean b = new Solution_860().lemonadeChange(new int[]{5, 5, 5, 5, 20, 20, 5, 5, 20, 5});
        System.out.println(b);
    }
}
