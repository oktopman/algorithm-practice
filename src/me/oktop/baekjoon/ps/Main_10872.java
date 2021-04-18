package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();

        int sum = factorial(nextInt);
        System.out.println(sum);
    }

    private static int factorial(int nextInt) {
        if (nextInt == 0) {
            return 1;
        }

        return nextInt * factorial(nextInt - 1);
    }
}
