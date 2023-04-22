package 프로그래머스코테;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		
//		int[] answer = new int[num2 - num1 + 1];
//		int j = 0;
//		for (int i = num1; i <= num2; i++) {
//			answer[j] = numbers[i];
//			j++;
//		}
		
		int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
		
		System.out.println(Arrays.toString(answer));
	}
}
