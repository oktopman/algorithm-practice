package me.oktop.level1;

/**
 * Created by hayun on 17/01/2020.
 */
public class GetCenterString {

		public String solution(String s) {
			int len = s.length();
			int quotient =  len / 2; // 몫

			return len % 2 > 0 ? String.valueOf(s.charAt(quotient)) : s.substring(quotient -1, quotient + 1);
		}

	public static void main(String[] args) {
		GetCenterString getCenterString = new GetCenterString();
		System.out.println(getCenterString.solution("qwer"));
	}

}
