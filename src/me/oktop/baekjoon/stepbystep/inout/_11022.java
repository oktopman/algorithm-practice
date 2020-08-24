package me.oktop.baekjoon.stepbystep.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            System.out.println(String.format("Case #%s: %s + %s = %s", i + 1, a, b, a + b));
        }
    }
}
