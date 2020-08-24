package me.oktop.baekjoon.stepbystep.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10950 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] numberArray = new int[count];
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            numberArray[i] = Integer.parseInt(s.split(" ")[0]) + Integer.parseInt(s.split(" ")[1]);
        }

        Arrays.stream(numberArray).forEach(System.out::println);
    }
}
