package me.oktop.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hayun on 17/01/2020.
 */
public class HateSameNumber {

	public int[] solution(int[] arr) {
		int num = 10;
		List<Integer> list = new ArrayList<>();
		for (Integer temp : arr) {
			if (num != temp) {
				list.add(temp);
			}
			num = temp;
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		HateSameNumber hateSameNumber = new HateSameNumber();
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		hateSameNumber.solution(arr);
	}

}
