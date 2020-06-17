package me.oktop.baekjoon.stepbystep.ifstatement;

import java.util.Scanner;

public class _14681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        if (first > 0) {
            if (second > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        }

        if (first < 0) {
            if (second > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
