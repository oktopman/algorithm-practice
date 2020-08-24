package me.oktop.baekjoon.stepbystep.inout;

import java.util.Scanner;

public class _8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= nextInt; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
