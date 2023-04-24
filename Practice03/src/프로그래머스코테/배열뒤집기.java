package 프로그래머스코테;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] num_list = {1, 1, 1, 1, 1, 2};
		int[] answer = new int[num_list.length];
		
		int j = num_list.length - 1;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[j];
			j--;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
