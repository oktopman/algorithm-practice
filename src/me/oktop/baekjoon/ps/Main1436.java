package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num;
        if (n == 1) {
            num = "666";
        } else {
            num = n + "666";
        }
        System.out.println(num);
    }
}
