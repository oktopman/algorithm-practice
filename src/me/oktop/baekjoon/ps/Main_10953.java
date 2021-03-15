package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_10953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String[] array = sc.next().split(",");
            System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
        }
    }
}
