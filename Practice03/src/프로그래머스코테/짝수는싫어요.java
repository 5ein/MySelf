package 프로그래머스코테;

import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 15;
		
		int[] answer = new int[(n+1)/2];
		
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				answer[i/2] = i;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
