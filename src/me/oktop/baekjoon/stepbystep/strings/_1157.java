package me.oktop.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        String mapKey = null;
        int temp = 0;
        boolean isExits = false;
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() > temp) {
                temp = element.getValue();
                mapKey = element.getKey();
                isExits = false;
            } else if (element.getValue() == temp) {
                isExits = true;
            }
        }

        if (isExits) {
            System.out.println("?");
        } else {
            System.out.println(mapKey.toUpperCase());
        }
    }
}
