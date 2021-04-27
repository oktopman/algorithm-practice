package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if (sum < 0) {
                    continue;
                }
                if (s.charAt(j) == '(') {
                    sum++;
                } else {
                    sum--;
                }
            }
            arr[i] = sum == 0 ? "YES" : "NO";
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
