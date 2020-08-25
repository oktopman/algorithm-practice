package me.oktop.baekjoon.stepbystep.greedy;

import java.util.Scanner;

public class _1541 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\-");
        String[] plusArr = arr[0].split("\\+");
        int result = 0;
        for (String element : plusArr) {
            result += Integer.parseInt(element);
        }

        for (int i = 1; i < arr.length; i++) {
            String[] split = arr[i].split("\\+");
            int temp = 0;
            for (int j = 0; j < split.length; j++) {
                temp += Integer.parseInt(split[j]);
            }
            result -= temp;
        }
        System.out.println(result);
    }
}
