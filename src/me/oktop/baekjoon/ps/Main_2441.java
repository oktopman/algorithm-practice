package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = 0;
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num; k++) {
                if (index >= k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            index++;
            System.out.println();
        }
    }
}
