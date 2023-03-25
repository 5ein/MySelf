package 문제풀이;

public class Exercise11 {
	public static void main(String[] args) {
		
		//오류발생시 "오류발생"이 출력되도록 실행문을 작성하게요
		try {
			String s = new String("java");
			int len1 = s.length();
			s = null;
			int len2 = s.length();
		} catch (NullPointerException e) {
			System.out.println("오류발생");
		}
		System.out.println("OK");
	}
}
