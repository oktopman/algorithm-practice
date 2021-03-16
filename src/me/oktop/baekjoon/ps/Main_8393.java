package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= num; i++) {
            n += i;
        }
        System.out.println(n);
    }
}
