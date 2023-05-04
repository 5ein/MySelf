package 알고리즘스터디;

public class 문자열곱하기 {

	public static void main(String[] args) {
		String my_string = "love";
		int k = 10;
		String answer = "";
		
		for (int i = 0; i < k; i++) {
			answer += my_string;
		}
		
		System.out.println(answer);
	}

}
