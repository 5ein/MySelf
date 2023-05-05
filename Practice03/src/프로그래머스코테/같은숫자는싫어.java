package 프로그래머스코테;

import java.util.Arrays;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int []arr = {1,1,3,3,0,1,1};
		
		int j = 0;
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		
		int[] answer = new int[j];
		for (int i = 0; i < j; i++) {
			answer[i] = temp[i];
		}
		
		
		//다시 풀어봐
		
		System.out.println(Arrays.toString(answer));
	}

}
