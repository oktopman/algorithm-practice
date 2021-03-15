package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_11021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.format("Case #%d: %d", i + 1, a + b));
        }
    }
}
