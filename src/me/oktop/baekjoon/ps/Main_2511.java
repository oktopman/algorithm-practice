package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int[] a = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();
        String[] v = new String[10];

        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                aScore += 3;
                v[i] = "A";
            } else if (a[i] < b[i]) {
                bScore += 3;
                v[i] = "B";
            } else {
                aScore += 1;
                bScore += 1;
                v[i] = "D";
            }
        }

        String winner = "";
        for (int i = 9; i >= 0; i--) {
            if (!v[i].equals("D")) {
                winner = v[i];
                break;
            }
            if (i == 0 && v[i].equals("D")) {
                winner = "D";
            }

        }

        System.out.println(String.format("%s %s", aScore, bScore));
        if (aScore > bScore) {
            System.out.println("A");
        } else if (aScore < bScore) {
            System.out.println("B");
        } else {
            System.out.println(winner);
        }
    }
}
