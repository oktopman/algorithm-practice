package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            int num = Integer.parseInt(s);
            map.put(num % 42, 1);
        }

        System.out.println(map.size());
    }
}
