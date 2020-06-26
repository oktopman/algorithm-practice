package me.oktop.baekjoon.stepbystep.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakEvenPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int fix = Integer.parseInt(s[0]);
        int profit = Integer.parseInt(s[2]) - Integer.parseInt(s[1]);
        int result;
        if (Integer.parseInt(s[1]) >= Integer.parseInt(s[2])) {
            result = -1;
        } else {
            result = fix / profit + 1;
        }
        System.out.println(result);
    }
}
