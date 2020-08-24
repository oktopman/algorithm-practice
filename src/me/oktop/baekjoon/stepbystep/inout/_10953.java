package me.oktop.baekjoon.stepbystep.inout;

import java.util.Scanner;

public class _10953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            String[] s = sc.next().split(",");
            System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
        }
    }
}
