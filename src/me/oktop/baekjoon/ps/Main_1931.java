package me.oktop.baekjoon.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Study> studies = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            studies.add(new Study(start, end));
        }

        studies.sort((o1, o2) -> {
            if (o1.end > o2.end) {
                return 1;
            } else if (o1.end < o2.end) {
                return -1;
            }
            return Integer.compare(o1.start, o2.start);
        });

        int num = 0;
        int time = 0;
        for (int i = 0; i < studies.size(); i++) {
            if (studies.get(i).start >= time) {
                time = studies.get(i).end;
                num++;
            }
        }
        System.out.println(num);
    }
}

class Study {
    int start;
    int end;

    public Study(int start, int end) {
        this.start = start;
        this.end = end;
    }

}
