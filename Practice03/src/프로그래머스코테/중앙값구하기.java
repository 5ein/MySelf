package 프로그래머스코테;

import java.util.ArrayList;
import java.util.Collections;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] array = {1, 2, 7, 10, 11};
		
		int answer = 0;
		
		//Array 이용
//		Arrays.sort(array);
//		answer = array[array.length / 2];
		
		//Collection 이용
		ArrayList<Integer> list = new ArrayList<>();
		for (int x : array) {
			list.add(x);
		}
		Collections.sort(list);
		answer = list.get(array.length / 2);
		
		
		System.out.println(answer);
	}

}
