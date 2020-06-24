package me.oktop.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            boolean isExists = false;
            String s = br.readLine();
            List<Character> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                if (list.contains(s.charAt(j)) && (s.charAt(j - 1) != s.charAt(j))) {
                    isExists = true;
                    break;
                }
                list.add(s.charAt(j));
            }

            if (!isExists) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
