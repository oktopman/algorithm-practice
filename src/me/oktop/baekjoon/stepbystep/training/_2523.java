package me.oktop.baekjoon.stepbystep.training;

import java.util.Scanner;

public class _2523 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = count - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
