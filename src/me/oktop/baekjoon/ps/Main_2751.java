package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // 선택 정렬
//        for (int i = 0; i < arr.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[minIndex] > arr[j]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 삽입 정렬
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
