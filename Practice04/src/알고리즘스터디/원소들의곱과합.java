package 알고리즘스터디;

public class 원소들의곱과합 {

	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		
		int sum = 0;
		int multiply = 1;
		
		//for
//		for (int i = 0; i < num_list.length; i++) {
//			sum += num_list[i];
//			multiply *= num_list[i];
//		}
		
		//for-each
		for (int x : num_list) {
			sum += x;
			multiply *= x;
		}
		
		if(multiply < sum * sum) answer = 1;
		else answer = 0;
		
		System.out.println(answer);
	}

}
