package me.oktop.baekjoon.stepbystep.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2438 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
