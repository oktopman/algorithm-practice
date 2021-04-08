package me.oktop.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        List<Box> boxes = new ArrayList<>();
        for (int[] boxs : boxTypes) {
            boxes.add(new Box(boxs[0], boxs[1]));
        }

        Collections.sort(boxes, (o1, o2) -> Integer.compare(o2.unit, o1.unit));
        int sum = 0;
        for (Box box : boxes) {
            if (truckSize - box.num > 0) {
                sum += box.unit * box.num;
                truckSize -= box.num;
                continue;
            }
            sum += truckSize * box.unit;
            break;
        }
        return sum;
    }

    public static void main(String[] args) {
//        int i = new Solution_1710().maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4);
        int i = new Solution_1710().maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10);
        System.out.println(i);
    }
}

class Box {
    int num;
    int unit;

    public Box(int num, int unit) {
        this.num = num;
        this.unit = unit;
    }
}
