package me.oktop.baekjoon.stepbystep.array;

import java.util.Scanner;

public class _2562 {

    public static void main(String[] args) {
        int temp = 0;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            int input = sc.nextInt();
            if (temp < input) {
                index = i + 1;
                temp = input;
            }
        }

        System.out.println(temp + " " + index);
    }
}
