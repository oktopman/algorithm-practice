package me.oktop.baekjoon.ps;

import java.util.Scanner;

public class Main_10828 {

    public static int[] stack;
    public static int index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        stack = new int[count];
        for (int i = 0; i < count; i++) {
            String command = sc.next();

            if ("push".equals(command)) {
                push(sc.nextInt());
            } else if ("pop".equals(command)) {
                pop();
            } else if ("size".equals(command)) {
                size();
            } else if ("empty".equals(command)) {
                empty();
            } else if ("top".equals(command)) {
                top();
            }
        }
    }

    public static void push(int num) {
        stack[index] = num;
        index++;
    }

    public static void pop() {
        if (index == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stack[index - 1]);
            stack[index - 1] = 0;
            index--;
        }
    }

    public static void size() {
        System.out.println(index);
    }

    public static void empty() {
        if (index == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void top() {
        if (index == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stack[index - 1]);
        }
    }
}

