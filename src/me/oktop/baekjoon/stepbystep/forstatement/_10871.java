package me.oktop.baekjoon.stepbystep.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class _10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().split(" ")[1]);

        String[] s = br.readLine().split(" ");
        int[] intArray = Arrays.stream(s)
                .mapToInt(Integer::parseInt)
                .toArray();

        String collect = Arrays.stream(intArray)
                .filter(v -> v < x)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }
}
