package me.oktop.baekjoon.stepbystep.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] thirdNumberArray = br.readLine().split(" ");
        int[] ints = Arrays.stream(thirdNumberArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(ints);

        System.out.println(thirdNumberArray[1]);
    }
}
