package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int k = 1; k <= num; k++) {
                if (k >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
