package me.oktop.baekjoon.stepbystep.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class _11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int count = Integer.parseInt(s[0]);
        int money = Integer.parseInt(s[1]);
        Integer[] moneyArray = new Integer[count];
        for (int i = 0; i < count; i++) {
            moneyArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(moneyArray, Collections.reverseOrder());
        int result = 0;
        for (Integer element : moneyArray) {
            if (money >= element) {
                result += money / element;
                money = money % element;
            }
        }

        System.out.println(result);
    }
}
