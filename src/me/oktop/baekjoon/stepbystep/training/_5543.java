package me.oktop.baekjoon.stepbystep.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] burger = new int[3];
        for (int i = 0; i < 3; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }

        int[] drink = new int[2];
        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Math.min(Math.min(burger[0], burger[1]), burger[2]) +
                Math.min(drink[0], drink[1]) - 50);
    }
}
