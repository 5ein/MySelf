package 프로그래머스코테;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;

//		//풀이 1
//		int count = 0;
//		for(int x: arr) {
//			if(x % divisor == 0) count++;
//		}
//		if(count == 0) {
//			int[] answer = {-1};
//			System.out.println(Arrays.toString(answer));
//		}
//		int[] answer = new int[count];
//		int j = 0;
//		for(int x: arr) {
//			if(x % divisor == 0) {
//				answer[j] = x;
//				j++;
//			}
//		}
//		Arrays.sort(answer);
//		System.out.println(Arrays.toString(answer));
		
		//풀이 2 (arraylist이용하기)
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : arr) {
			if(x % divisor == 0) {
				list.add(x);
			}
		}
		int[] answer = null;
		if (list.size() !=0) {
			answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
