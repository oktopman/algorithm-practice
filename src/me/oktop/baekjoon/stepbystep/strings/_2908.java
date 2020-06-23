package me.oktop.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = sb.append(br.readLine()).reverse().toString().split(" ");
        int num1 = Integer.parseInt(s[0]);
        int num2 = Integer.parseInt(s[1]);
        System.out.println(Math.max(num1, num2));
    }
}
