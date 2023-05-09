package 알고리즘스터디;

public class 홀짝에따라다른값반환하기 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		//1.
//		if(n % 2 != 0) {
//			for (int i = n; i > 0; i -= 2) {
//				answer += i;
//			}
//		}else {
//			for (int i = n; i > 0; i -= 2) {
//				answer += i * i;
//			}
//		}
		
		//2.
		for (int i = n; i > 0; i -= 2) {
			if(n % 2 != 0 ) answer += i;
			else answer += i * i;
		}
		
		
		System.out.println(answer);
	}

}
