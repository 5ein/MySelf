package 기타;

public class 글자찾기 {
	
//	String s = "아침점심저녁";
//			s에 ‘점’이 포함되어 있으면 위치를 프린트
//			s에 ‘점’이 포함되어 있지 않으면 -1을 프린트

	public static void main(String[] args) {
		String s = "아침점심저녁";
		int answer = -1;
		
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == '.') {
				answer = i;
			}
		}
		System.out.println(answer);
		
	}
}
