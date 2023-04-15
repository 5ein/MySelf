package 프로그래머스코테;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 4;
		
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i * 6 % n == 0) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
