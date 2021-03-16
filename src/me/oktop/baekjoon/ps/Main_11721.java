package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int size = s.length() % 10 != 0 ? s.length() / 10 + 1 : s.length() / 10;

        int start = 0;
        for (int i = 0; i < size; i++) {
            if (i + 1 == size) {
                System.out.println(s.substring(start));
                break;
            }
            System.out.println(s.substring(start, start + 10));
            start += 10;
        }
    }
}
