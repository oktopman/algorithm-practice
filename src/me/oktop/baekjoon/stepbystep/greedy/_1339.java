package me.oktop.baekjoon.stepbystep.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1339 {

    public static void main(String[] args) throws IOException {
//        A = 9, B = 4, C = 8, D = 6, E = 5, F = 3, G = 7
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 9);
        map.put("B", 4);
        map.put("C", 8);
        map.put("D", 6);
        map.put("E", 5);
        map.put("F", 3);
        map.put("G", 7);
        map.put("H", 2);
        map.put("I", 1);
        map.put("J", 0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] eng = new int[count];
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                temp.append(map.get(String.valueOf(s.charAt(j))));
            }
            eng[i] = Integer.parseInt(temp.toString());
        }

        int result = 0;
        for (int element : eng) {
            result += element;
        }
        System.out.println(result);
    }
}
