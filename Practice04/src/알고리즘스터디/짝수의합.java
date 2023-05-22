package 알고리즘스터디;

public class 짝수의합 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		
		System.out.println(answer);
	}

}
