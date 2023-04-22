package 프로그래머스코테;

public class 문자열뒤집기 {

	//프로그래머스 문자열뒤집기 문제
	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
		
		StringBuilder sb = new StringBuilder();
		sb.append(my_string);
		sb.reverse();
		answer = sb.toString();
		
		System.out.println(answer);
	}

}
