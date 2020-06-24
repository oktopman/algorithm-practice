package me.oktop.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class _5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        List<String> strings = Arrays.asList("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ");

        int sum = 0;
        for (char c : chars) {
            for (int i = 0; i < strings.size(); i++) {
                for (int j = 0; j < strings.get(i).length(); j++) {
                    if (c == strings.get(i).charAt(j)) {
                        sum += i + 3;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
