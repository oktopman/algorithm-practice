package me.oktop.baekjoon.stepbystep.forstatement;

import java.io.*;
import java.util.stream.IntStream;

public class _11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bw.readLine());
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            array[i] = bw.readLine();
        }

        IntStream.range(0, size).forEach(i -> {
            String[] s = array[i].split(" ");
            System.out.println(String.format("Case #%d: %d", i + 1, Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
        });
    }
}
