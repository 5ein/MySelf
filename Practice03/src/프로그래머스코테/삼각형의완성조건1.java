package 프로그래머스코테;

import java.util.ArrayList;
import java.util.Collections;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
		int[] sides = {1, 2, 3};
		int answer = 0;
		
		//Array 이용
//		Arrays.sort(sides);
//		
//		if (sides[0] + sides[1] > sides[2]) {
//			answer = 1;
//		}else {
//			answer = 2;
//		}
		
		//collection 이용
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int x: sides){
			list.add(x);
		}
		Collections.sort(list);
		int max = list.get(2);
		int one = list.get(0);
		int two = list.get(1);
		
		if (max < one + two) {
			answer = 1;
		}else {
			answer = 2;
		}
		
		
		System.out.println(answer);
	}

}
