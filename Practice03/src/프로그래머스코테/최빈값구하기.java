package 프로그래머스코테;

import java.util.Arrays;

public class 최빈값구하기 {
		//최빈값 구하기 어려워!!
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4};
		int answer = 0;
		
		//1.
//		int[] index = new int[array.length];
//		int max = Integer.MIN_VALUE; //최대값을 저장하기위한 변수: 초기값은 정수형의 최소값 지정
//		for (int i = 0; i < array.length; i++) {
//			index[array[i]]++;
//		}
//		for (int i = 0; i < index.length; i++) {
//			if (index[i] > max) {
//				max = index[i];
//				answer = i;
//			}
//		}
		
		//2.
//		int[] ary = new int[1001];
//		for (int i = 0; i < array.length; i++) {
//			ary[array[i]]++;
//		}
//		int max = 0;
//		int max_index = 0;
//		for (int i = 0; i < ary.length; i++) {
//			if (ary[i] > max) {
//				max = ary[i];
//				max_index = i;
//			}
//		}
//		int count = 0;
//		for (int i = 0; i < ary.length; i++) {
//			if (ary[i] == max) count++;
//		}
//		if(count > 1) answer = - 1;
//		answer = max_index;
		
		//3. 
		int max;
		Arrays.sort(array); //오름차순
		max = array[array.length - 1]; //가장 큰 수를 max로 설정
		
		int[] count = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			count[array[i]]++; // 각 수의 index에 count
		}
		max = count[0];
		//가장 큰 coount값을 max롤 설정
		for (int i = 1; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = i; //max값이 바뀔 때의 index(최빈값)
			}else if(max == count[i]) { //최빈값이 여러개인 경우 -1 return
				answer = -1;
			}
		}
		
		
		System.out.println(answer);
	}

}
