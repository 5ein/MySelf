package 알고리즘스터디;

import java.util.Scanner;

public class 문자열돌리기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		// 1. String 배열로 split이용해서 풀기
//        String[] str = a.split("");
//        for (String x : str) {
//			System.out.println(x);
//		}

		// 2. toCharArray() 이용해서 풀기
//        for (char x : a.toCharArray()) {
//			System.out.println(x);
//		}

		// 3. charAt() 이용해서 풀기
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}

		sc.close();
	}

}
