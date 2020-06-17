package me.oktop.baekjoon.stepbystep.ifstatement;

import java.util.Scanner;

public class _2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int earlyAlarm = 45;
        int oneHourToMinute = 60;

        if (minute < earlyAlarm) {
            if (hour == 0) {
                hour = 24;
            }
            System.out.println((--hour) + " " + (oneHourToMinute + minute - earlyAlarm));
        } else {
            System.out.println(hour + " " + (minute - earlyAlarm));
        }
    }
}
