package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = num;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= index) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            index--;
            System.out.println();
        }
        index++;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 1; j <= num; j++) {
                if (j > index) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            index++;
            System.out.println();
        }
    }
}
