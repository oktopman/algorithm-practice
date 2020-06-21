package me.oktop.baekjoon.stepbystep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] s = br.readLine().split(" ");

        int[] intArray = Arrays.stream(s)
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(intArray);
        System.out.println(intArray[0] + " " + intArray[intArray.length - 1]);
    }
}
