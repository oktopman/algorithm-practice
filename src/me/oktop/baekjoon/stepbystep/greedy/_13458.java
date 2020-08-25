package me.oktop.baekjoon.stepbystep.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13458 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] students = new int[count];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int head = Integer.parseInt(st1.nextToken());
        int sub = Integer.parseInt(st1.nextToken());

        long result = 0;
        for (int i = 0; i < count; i++) {
            students[i] = Integer.parseInt(st.nextToken());
            students[i] -= head;
            result++;
            if (students[i] <= 0) {
                continue;
            }

            if (students[i] % sub == 0) {
                result += students[i] / sub;
            } else {
                result += students[i] / sub;
                result++;
            }
        }
        System.out.println(result);
    }
}
