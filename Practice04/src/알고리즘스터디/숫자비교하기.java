package 알고리즘스터디;

public class 숫자비교하기 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int answer = 0;
		
		//1. if - else 문 이용
//		if(num1 == num2) answer = 1;
//		else answer = -1;

		//2. 삼항연산자 이용
		answer = (num1 == num2)? 1 : -1;
		
		System.out.println(answer);
	}

}
