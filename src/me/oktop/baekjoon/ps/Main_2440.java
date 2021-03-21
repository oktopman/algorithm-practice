package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                if (k == i) {
                    System.out.println();
                }
            }
        }
    }
}
