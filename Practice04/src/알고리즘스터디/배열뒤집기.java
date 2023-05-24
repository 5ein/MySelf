package 알고리즘스터디;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		int[] answer = new int[num_list.length];
		
		int i = num_list.length - 1;
		for (int j = 0; j < answer.length; j++) {
			answer[i] = num_list[j];
			i--;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
