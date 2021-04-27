package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String s : input) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s).reverse().append(" ");
                sb.append(sb2);
            }
            arr[i] = sb.toString();

        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
