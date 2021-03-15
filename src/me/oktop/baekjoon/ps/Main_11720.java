package me.oktop.baekjoon.ps;

import java.io.IOException;
import java.util.Scanner;

public class Main_11720 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] split1 = br.readLine().split("");
        int count = sc.nextInt();
        int value = sc.nextInt();
        String s = String.valueOf(value);
        String[] split = s.split("");
        int n = 0;
        for (String num : split) {
            n += Integer.parseInt(num);
        }
        System.out.println(n);
    }
}
