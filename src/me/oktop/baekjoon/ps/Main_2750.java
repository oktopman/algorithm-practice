package me.oktop.baekjoon.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int index = i;
            for (int k = i + 1; k < count; k++) {
                if (arr[index] > arr[k]) {
                    index = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
