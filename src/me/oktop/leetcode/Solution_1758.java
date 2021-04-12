package me.oktop.leetcode;

public class Solution_1758 {
    public int minOperations(String s) {
        String[] arr = s.split("");

        int aCount = 0;
        int bCount = 0;
        String aWish = "0"; // 010101
        String bWish = "1"; // 101010
        // 110010

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(bWish)) {
                aCount++;
            } else {
                bCount++;
            }
            aWish = aWish.equals("1") ? "0" : "1";
            bWish = aWish.equals("0") ? "1" : "0";

        }

        return Math.min(aCount, bCount);
    }

    public static void main(String[] args) {
//        new Solution_1758().minOperations("0100");
//        new Solution_1758().minOperations("1111");
        int i = new Solution_1758().minOperations("110010");
        System.out.println(i);
    }
}
