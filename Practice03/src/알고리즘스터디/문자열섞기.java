package 알고리즘스터디;

public class 문자열섞기 {

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String answer = "";

		// 1. charAt 사용
//		for (int i = 0; i < str1.length(); i++) {
//			answer += str1.charAt(i);
//			answer += str2.charAt(i);
//		}

		// 2.SpringBuilder 사용
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			sb.append(str1.charAt(i)).append(str2.charAt(i));
		}
		answer = sb.toString();

		System.out.println(answer);
	}

}
