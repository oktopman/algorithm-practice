package me.oktop.baekjoon.stepbystep.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int size = s.length() / 10;
        for (int i = 0; i <= size; i++) {
            if (i == size) {
                System.out.println(s.substring(i * 10));
            } else {
                System.out.println(s.substring(i * 10, i * 10 + 10));
            }
        }

    }
}
