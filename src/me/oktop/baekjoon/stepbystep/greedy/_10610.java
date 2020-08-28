package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class _10610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("");
        int[] digits = new int[s.length()];

        int sum = 0;
        int num;
        for (int i = 0; i < arr.length; i++) {
            num = Integer.parseInt(arr[i]);
            sum += num;
            digits[i] = num;
        }

        if (sum % 3 != 0 || !s.contains("0")) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        System.out.println(sb.toString());
    }
}
