package 프로그래머스코테;

import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
		
		int[] answer = new int[numbers.length];
		
		for (int i = 0; i <numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
