package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Scanner;

public class _10162 {

    public static void main(String[] args) {
        int[] minute = new int[]{300, 60, 10};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] counts = new String[3];
        for (int i = 0; i < 3; i++) {
            if (input >= minute[i]) {
                counts[i] = String.valueOf(input / minute[i]);
                input = input % minute[i];
            } else {
                counts[i] = "0";
            }
        }

        if (input != 0) {
            System.out.println(-1);
        } else {
            System.out.println(String.join(" ", counts));
        }

    }
}
