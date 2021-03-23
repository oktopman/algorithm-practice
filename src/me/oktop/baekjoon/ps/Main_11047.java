package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int length = arr.length;
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] > k) {
                continue;
            }
            count += k / arr[i];
            k %= arr[i];
        }
        System.out.println(count);
    }
}
