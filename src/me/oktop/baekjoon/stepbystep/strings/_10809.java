package me.oktop.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class _10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        StringBuilder sb = new StringBuilder();
        String[] array = br.readLine().split("");
        List<String> strings1 = Arrays.asList(array);

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (!strings1.contains(strings.get(i))) {
                    sb.append(-1).append(" ");
                    break;
                }

                if (array[j].equals(strings.get(i))) {
                    sb.append(j).append(" ");
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}

