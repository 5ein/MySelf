package 프로그래머스코테;

public class 특정문자제거하기 {

	public static void main(String[] args) {
		String my_string = "BCBdbe";
		String letter = "B";
		String answer = "";
		
		//1. 
//		for (int i = 0; i < my_string.length(); i++) {
//			char c = my_string.charAt(i);
//			if(c != letter.charAt(0)) {
//				answer += c;
//			}
//		}
		
		//2. continue 이용
		for (int i = 0; i < my_string.length(); i++) {
		char c = my_string.charAt(i);
		if(c == letter.charAt(0)) continue;
		answer += c;
	}
		
		//3. replace 이용
//		answer = my_string.replace(letter, "");
		
		System.out.println(answer);
	}

}