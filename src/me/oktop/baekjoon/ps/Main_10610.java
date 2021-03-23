package me.oktop.baekjoon.ps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main_10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if (num.equals("30")) {
            System.out.println(num);
            return;
        }

        if (!num.contains("0")) {
            System.out.println(-1);
            return;
        }

        String[] arr = num.split("");
        int sum = 0;

        for (String i : arr) {
            sum += Integer.parseInt(i);
        }

        if (sum % 3 != 0 && String.valueOf(sum).contains("0")) {
            System.out.println(-1);
            return;
        }

        String s = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        System.out.println(s);
    }
}
