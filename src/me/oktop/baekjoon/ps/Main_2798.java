package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int count = Integer.parseInt(s[0]);
        int goal = Integer.parseInt(s[1]);
        String[] arr = br.readLine().split(" ");

        int result = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    int sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[k]);
                    if (sum == goal) {
                        System.out.println(sum);
                        return;
                    }
                    if (result < sum && sum < goal) {
                        result = sum;
                    }
                }
            }

        }
        System.out.println(result);
    }
}
