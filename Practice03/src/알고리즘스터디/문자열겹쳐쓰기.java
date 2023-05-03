package 알고리즘스터디;

public class 문자열겹쳐쓰기 {

	public static void main(String[] args) {
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;

		String answer = "";

		// 1.substring 이용방법
		answer = my_string.substring(0, s) + overwrite_string 
				+ my_string.substring(s + overwrite_string.length());

		// 2. 배열, split 이용방법
//		int s2 = overwrite_string.length();
//		String[] str = my_string.split("");
//		for (int i = 0; i < s; i++) {
//			answer += str[i];
//		}
//
//		answer += overwrite_string;
//
//		for (int i = s + s2; i < my_string.length(); i++) {
//			answer += str[i];
//		}

		// 3. char
//		for (int i = 0; i < s; i++) {
//			answer += my_string.charAt(i);
//		}
//		answer += overwrite_string;
//		for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
//			answer += my_string.charAt(i);
//		}

		System.out.println(answer);
	}

}