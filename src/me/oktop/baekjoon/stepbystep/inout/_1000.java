package me.oktop.baekjoon.stepbystep.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int first = Integer.parseInt(input.split(" ")[0]);
        int second = Integer.parseInt(input.split(" ")[1]);
        System.out.println(first + second);
    }
}
