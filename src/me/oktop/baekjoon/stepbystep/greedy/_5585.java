package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Scanner;

public class _5585 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = 1000 - sc.nextInt();
        int count = 0;
        int[] money = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < money.length; i++) {
            if (change == 0) {
                break;
            }
            if (change >= money[i]) {
                count += change / money[i];
                change = change % money[i];
            }
        }
        System.out.println(count);
    }
}
