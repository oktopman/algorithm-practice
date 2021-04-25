package me.oktop.baekjoon.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] arr = br.readLine().split(" ");
            humans.add(new Human(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), 1));
        }

        String[] ranks = new String[count];
        for (int i = 0; i < count; i++) {
            Human human1 = humans.get(i);
            for (int k = 0; k < count; k++) {
                Human human2 = humans.get(k);
                if (human1.cm < human2.cm && human1.kg < human2.kg) {
                    human1.rank = ++human1.rank;
                }
            }
            ranks[i] = String.valueOf(human1.rank);

        }

        System.out.println(String.join(" ", ranks));

    }
}

class Human {
    int kg;
    int cm;
    int rank;

    public Human(int kg, int cm, int rank) {
        this.kg = kg;
        this.cm = cm;
        this.rank = rank;
    }
}
