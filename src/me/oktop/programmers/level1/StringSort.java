package me.oktop.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for (String temp : strings) {
            list.add(temp.charAt(n) + temp);
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {

        new StringSort().solution(new String[]{"abce", "abcd", "cdx"}, 2);
    }
}
