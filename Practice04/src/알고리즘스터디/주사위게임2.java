package 알고리즘스터디;

public class 주사위게임2 {

	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		int c = 1;
		int answer = 0;
		
		if(a != b && b != c && c != a) answer = a + b + c;
		else if(a == b && b == c) answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c* c);
		else answer = (a + b + c) * (a * a + b * b + c* c);
				
		System.out.println(answer);
	}

}
