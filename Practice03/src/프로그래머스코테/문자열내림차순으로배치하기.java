package 프로그래머스코테;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		//1. split으로 String[] 이용
//		String answer = "";
//		String[] ss = s.split("");
//		Arrays.sort(ss);  //정렬
//		for (int i = ss.length - 1; i >= 0; i--) {
//			answer += ss[i];
//		}

		//2. Char[], StringBuilder 이용  ==> 시간복잡도 좋음.
		char[] C = s.toCharArray();
		Arrays.sort(C);  //정렬
		String c2 = new String(C);
		StringBuilder sb = new StringBuilder(c2);
		String answer = sb.reverse().toString();  //역정렬, 문자열로 전환
		
		
		System.out.println(answer);
	}

}
