package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        long[] arr = new long[count];
        for (int i = 0; i < count; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            long temp = 1;
            for (int j = 0; j < b; j++) {
                temp = temp * a % 10;
            }
            if (temp == 0) {
                temp = 10;
            }

            arr[i] = temp;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
