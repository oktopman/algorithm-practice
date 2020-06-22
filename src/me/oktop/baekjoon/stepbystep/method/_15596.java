package me.oktop.baekjoon.stepbystep.method;

public class _15596 {

    long sum(int[] a) {
        long temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(new _15596().sum(new int[]{1,2,3,4,5}));
    }
}
