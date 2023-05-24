package 알고리즘스터디;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
		
		String[] s = my_string.split("");
		for (int i = my_string.length() - 1; i >= 0; i--) {
			answer +=  s[i];
		}

		System.out.println(answer);
	}

}
