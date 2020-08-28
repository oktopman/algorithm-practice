package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Scanner;

public class _2875 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]); // 여학생
        int m = Integer.parseInt(s[1]); // 남학생
        int k = Integer.parseInt(s[2]); // 인턴

        if (n + m < 3 + k || n + m < k) {
            System.out.println(0);
            return;
        }

        int result = 0;
        while (n >= 2 && m >= 1) {
            n -= 2;
            m -= 1;
            result++;
            if (n + m < 3 + k) {
                break;
            }
        }
        System.out.println(result);
    }
}
