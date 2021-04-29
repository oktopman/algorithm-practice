package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }

        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
