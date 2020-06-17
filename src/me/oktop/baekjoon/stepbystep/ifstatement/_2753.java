package me.oktop.baekjoon.stepbystep.ifstatement;

import java.util.Scanner;

public class _2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean isMultipleOf4 = input % 4 == 0;
        boolean isNotMultipleOf100 = input % 100 != 0;
        boolean isMultipleOf400 = input % 400 == 0;

        if (isMultipleOf4 && (isNotMultipleOf100 || isMultipleOf400)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
