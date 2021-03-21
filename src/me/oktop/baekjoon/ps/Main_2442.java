package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = num;
        int length = num * 2 - 1;
        for (int i = 1; i <= num; i++) {
            int count = i * 2 - 1;
            for (int k = 1; k <= length; k++) {
                if (k == index) {
                    for (int j = 0; j < count; j++) {
                        System.out.print("*");
                    }
                    break;
                }
                System.out.print(" ");
            }
            index--;
            System.out.println();
        }
    }
}
