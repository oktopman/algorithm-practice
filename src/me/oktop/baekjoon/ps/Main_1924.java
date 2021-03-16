package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_1924 {

    public static void main(String[] args) {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        int totalDay = day;
        for (int i = 0; i < month - 1; i++) {
            totalDay += dayOfMonth[i];
        }
        System.out.println(dayOfTheWeek[totalDay % 7]);
    }
}
