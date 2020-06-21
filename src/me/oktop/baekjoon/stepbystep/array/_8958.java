package me.oktop.baekjoon.stepbystep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int temp = 0;
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'X') {
                    temp = 0;
                    continue;
                }
                temp++;
                sum += temp;
            }
            ints[i] = sum;
        }

        Arrays.stream(ints).forEach(System.out::println);
    }
}
