package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int index = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                if (index >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = num; j >= 1; j--) {
                if (index >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            index++;
            System.out.println();
        }
        index--;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j < index) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = num; j >= 1; j--) {
                if (j < index) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            index--;
            System.out.println();
        }
    }
}
