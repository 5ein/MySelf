package self;

public class Exercise03 {

	public static void main(String[] args) {
		int num = 10;
		int sum1 = 0; // num 변수의 값이 짝수일 때 합걔를 저장할 변수 선언
		int sum2 = 0; // num 변수의 값이 홀수일 때 합계를 저장할 변수 선엄
		
		//num 변수의 값이 홀수이면 0부터 num 변수의 값까지 홀수의 합을 출력하고,
		//num 변수의 값이 짝수이면 0부터 num 변수의 값까지 짝수의 합을 출력합니다.
		
		//1. 0부터 num 변수만큼 반복하여 합을 구한다.
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		
		//2. 홀수/짝수 판단을 위해 숫자를 2로 나눈 후 나머지 삾이 0이면 짝수이고 
		//	  그렇지 않으면 홀수 이다.
		if (num % 2 == 0) {
			System.out.println("결과 값: " + sum1);
		} else {
			System.out.println("결과 값: " + sum2);
		}
				
	}

}
