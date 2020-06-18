package me.oktop.baekjoon.stepbystep.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10950 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        final String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            array[i] = br.readLine();
        }

        Arrays.stream(array).forEach(v -> {
            String[] s = v.split(" ");
            System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
        });

    }
}
