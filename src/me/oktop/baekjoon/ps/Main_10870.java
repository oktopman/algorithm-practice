package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibonacci = fibonacci(sc.nextInt());
        System.out.println(fibonacci);
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
