package 프로그래머스코테;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int []arr = {1,1,3,3,0,1,1};
		
		//1. 
//		int j = 0;
//		int[] temp = new int[arr.length];
//		for (int i = 0; i < arr.length - 1; i++) {
//			if(arr[i] != arr[i+1]) {
//				temp[j++] = arr[i];
//			}
//		}
//		temp[j++] = arr[arr.length - 1];
//		
//		int[] answer = new int[j];
//		for (int i = 0; i < j; i++) {
//			answer[i] = temp[i];
//		}
			
		//2. Stack 이용
		List<Integer> list = new ArrayList<Integer>();
		int saveNum = -1;
		for (int x : arr) {
			if(saveNum != x) list.add(saveNum = x);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
