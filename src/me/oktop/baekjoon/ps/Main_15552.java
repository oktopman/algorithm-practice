package me.oktop.baekjoon.ps;

import java.io.*;

public class Main_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] arr = br.readLine().split(" ");
            int i1 = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            bw.write(i1 + "\n");
        }
        bw.flush();
    }
}
