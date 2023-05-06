package 프로그래머스코테;

import java.util.Arrays;

public class 분수의덧셈 {

	public static void main(String[] args) {
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 3;
		int denom2 = 4;
		
		//1. 큰 수에서 작은 수로 내려가면서 나누기
//		int numerator = (numer1 * denom2) + (numer2 * denom1);
//		int denominator = denom1 * denom2;
//		
//		//기약분수 만들기
//		for(int i = numerator - 1; i > 1; i--) { 
//			// numerator/numerator는 무조건 1이기 때문에 안해도 되어서 i = numerator -1
//			if(numerator % i == 0 && denominator % i == 0) {
//				numerator /= i;
//				denominator /= i;
//			}
//		}
//		
//		int[] answer = {numerator, denominator};
		
		//2. 작은 수에서 큰 수로 올라가면서 나눌 수 찾기
//		int top = (numer1 * denom2) + (numer2 * denom1);
//		int bottom = denom1 * denom2;
//		int gcd = 1;
//		for (int i = 1; i <= top && i <= bottom; i++) {
//			if(bottom % i == 0 && top % i == 0) {
//				gcd = i;
//			}
//		}
//		
//		int[] answer = {top / gcd, bottom / gcd};
		
		//2-1. max 함수를 사용하여 둘중 더 큰 수를 길이 이용
		int top = (numer1 * denom2) + (numer2 * denom1);
		int bottom = denom1 * denom2;
		int max = Math.max(top, bottom);
		int gcd = 1;
		for (int i = 1; i < max; i++) {
			if(bottom % i == 0 && top % i == 0) gcd = i;
		}
		int[] answer = {top / gcd, bottom / gcd};
		
		
		System.out.println(Arrays.toString(answer));
	}

}
