package 프로그래머스코테;

public class 중복된숫자개수 {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;
		int answer = 0;
		
		for(int x: array) {
			if(x == n) answer++;
		}
		
		System.out.println(answer);
	}

}
