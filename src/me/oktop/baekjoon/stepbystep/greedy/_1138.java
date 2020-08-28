package me.oktop.baekjoon.stepbystep.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>(3);
        for (int i = count - 1; i >= 0; i--) {
            list.add(input[i], i + 1);
        }
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
