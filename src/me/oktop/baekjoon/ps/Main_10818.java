package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] array = br.readLine().split(" ");
        List<Integer> list = Arrays.stream(array).map(Integer::parseInt).collect(Collectors.toList());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            min = Math.min(min, list.get(i));
            max = Math.max(max, list.get(i));
        }
        System.out.println(String.format("%d %d", min, max));

    }
}
