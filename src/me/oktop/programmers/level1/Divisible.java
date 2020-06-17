package me.oktop.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisible {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            int remainder = arr[i] % divisor;
//            if (remainder == 0) {
//                list.add(arr[i]);
//            }
//        }
//        if (list.size() == 0) {
//            return new int[]{-1};
//        }
//        Collections.sort(list);
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
        int[] result = Arrays.stream(arr)
                .filter(i -> i % divisor == 0)
                .toArray();
        if (result.length == 0) {
            return new int[]{-1};
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        new Divisible().solution(new int[]{2, 36, 1, 3}, 1);
    }
}
