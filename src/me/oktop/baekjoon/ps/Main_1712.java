package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int fix = Integer.parseInt(s[0]);
        int variable = Integer.parseInt(s[1]);
        int price = Integer.parseInt(s[2]);

        if (variable >= price) {
            System.out.println(-1);
            return;
        }

        int profit = price - variable;
        int num = fix % profit >= 0 ? fix / profit + 1 : fix / profit;
        System.out.println(num);
    }
}
