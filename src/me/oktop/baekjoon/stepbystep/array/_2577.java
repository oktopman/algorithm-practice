package me.oktop.baekjoon.stepbystep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(br.readLine());
        }

        String s = String.valueOf(result);
        int length = s.length();
        int[] intArray = new int[10];
        for (int i = 0; i < length; i++) {
            intArray[s.charAt(i) - '0']++;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}