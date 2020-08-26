package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Integer[] arr = new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        Integer[] weightArr = new Integer[count];
        for (int i = 0; i < count; i++) {
            weightArr[i] = arr[i] * (i + 1);
        }

        Arrays.sort(weightArr, Collections.reverseOrder());
        System.out.println(weightArr[0]);
    }

}
