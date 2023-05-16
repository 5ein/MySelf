package 알고리즘스터디;

import java.util.Arrays;

public class 마지막두원소 {

	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int[] answer = new int[num_list.length + 1];
		int last = num_list[num_list.length-1];
		int nolast = num_list[num_list.length-2];
		
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}
		
		if(last > nolast) answer[num_list.length] = last - nolast;
		else answer[num_list.length] = last * 2;
		
		System.out.println(Arrays.toString(answer));
	}

}
