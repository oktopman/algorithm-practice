package me.oktop.programmers.level1;

public class NumberSum {

    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new NumberSum().solution(5,3));
    }
}
