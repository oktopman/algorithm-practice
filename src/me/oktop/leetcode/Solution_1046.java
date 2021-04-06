package me.oktop.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        while (list.size() >= 2) {
            list.sort(Collections.reverseOrder());
            Integer first = list.get(0);
            Integer second = list.get(1);
            list.remove(0);
            list.remove(0);
            if (first - second != 0) {
                list.add(first - second);
            }
        }

        return list.size() == 0 ? 0 : list.get(0);
    }

    public static void main(String[] args) {
        int i = new Solution_1046().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        System.out.println(i);
    }
}
