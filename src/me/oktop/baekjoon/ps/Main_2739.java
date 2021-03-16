package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format("%d * %d = %d", num, i, num * i));
        }
    }
}
