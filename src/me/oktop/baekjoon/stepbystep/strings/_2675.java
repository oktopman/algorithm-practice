package me.oktop.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(s[0]); k++) {
                    sb.append(s[1].charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}