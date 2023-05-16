package 알고리즘스터디;

public class 수조작하기1 {

	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		int answer = n;

		// 1. .split()사용하기
//		String[] s = control.split("");
//		for (int i = 0; i < s.length; i++) {
//			if (s[i].equals("w")) answer++;
//			else if(s[i].equals("s")) answer--;
//			else if(s[i].equals("d")) answer += 10;
//			else answer -= 10;
//		}

		// 2. .toCharArray() 이용하기
//		char[] c = control.toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			if (c[i] == 'w') answer++;
//			else if (c[i] == 's') answer--;
//			else if (c[i] == 'd') answer += 10;
//			else answer -= 10;
//		}

		// 3. .charAt(i) 이용
		for (int i = 0; i < control.length(); i++) {
			char c = control.charAt(i);
			if (c == 'w') answer++;
			else if (c == 's') answer--;
			else if (c == 'd') answer += 10;
			else if (c == 'a') answer -= 10;
		}

		System.out.println(answer);
	}

}
