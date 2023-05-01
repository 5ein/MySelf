package 프로그래머스코테;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 123;
		int answer = 0;
		
//		String n2 = String.valueOf(n);
//		String[] n3 = n2.split("");
//
//		for (String x : n3) {
//			int n4 = Integer.parseInt(x);
//			answer += n4;
//		}
		
		while (n > 0) {
			answer = answer + n % 10;
			n = n / 10;
		}
		
		System.out.println(answer);
	}

}
