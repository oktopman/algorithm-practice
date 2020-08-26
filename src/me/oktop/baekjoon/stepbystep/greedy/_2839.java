package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Scanner;

public class _2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (true) {
            if (num % 5 == 0) {
                System.out.println(num / 5 + count);
                break;
            } else if (num < 0) {
                System.out.println(-1);
                break;
            }
            num -= 3;
            count++;
        }
    }
}
