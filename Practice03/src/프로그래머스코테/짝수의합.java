package 프로그래머스코테;

public class 짝수의합 {

	public static void main(String[] args) {
		int n = 10;
		
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) answer += i;
		}
		
		System.out.println(answer);
	}

}
