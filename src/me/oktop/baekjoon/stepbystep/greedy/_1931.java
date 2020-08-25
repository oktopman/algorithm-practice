package me.oktop.baekjoon.stepbystep.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] times = new int[count][2];
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                times[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(times, ((o1, o2) -> {
            if (o1[1] == o2[1]) { // 종료 시간이 같을 때,
                if (o1[0] > o2[0]) {
                    return 1;
                } else if (o1[0] < o2[0]) {
                    return -1;
                }
                return 0;
            } else if (o1[1] > o2[1]) {
                return 1;
            } else {
                return -1;
            }
        }));

        int result = 1;
        int end = times[0][1];
        int start;
        for (int i = 1; i < times.length; i++) {
            start = times[i][0];
            if (start >= end) {
                end = times[i][1];
                result++;
            }
        }
        System.out.println(result);
    }
}
