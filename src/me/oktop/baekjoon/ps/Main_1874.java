package me.oktop.baekjoon.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int index = 1;
        boolean isTrue = true;
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            while (index <= num) {
                stack.push(index);
                index++;
                list.add("+");
            }
            int pop = stack.pop();
            list.add("-");
            if (pop != num) {
                isTrue = false;
                break;
            }
        }

        if (!isTrue) {
            System.out.println("NO");
        } else {
            list.forEach(System.out::println);
        }

    }
}
