package 프로그래머스코테;

import java.util.Arrays;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = strlist[i].length();
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
