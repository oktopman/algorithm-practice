package me.oktop.baekjoon.stepbystep.inout;

import java.util.Scanner;

public class _2739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format("%s * %s = %s", nextInt, i, nextInt * i));
        }
    }
}
