package 알고리즘스터디;

public class 두수의연산값비교하기 {

	public static void main(String[] args) {
		int a = 2;
		int b = 91;
		int answer = 0;

		String aa = Integer.toString(a);
		int i = Integer.parseInt(aa + b);
		int j = 2 * a * b;
		
		if(j > i) answer = j;
		else answer = i;
		
		System.out.println(answer);
	}

}
