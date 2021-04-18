package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(1);
            return;
        }

        int first = num / 10;
        int second = num % 10;
        int count = 0;
        int sum = 0;

        while (num != sum) {
            sum = first + second;
            count++;

            first = second;
            second = sum % 10;
            String a = String.valueOf(first);
            String b = String.valueOf(second);
            sum = Integer.parseInt(a + b);
        }
        System.out.println(count);
    }
}
