package 프로그래머스코테;

public class 각도기 {

	public static void main(String[] args) {
		int angle = 91;
		
		int answer = 0;
		
		if(angle > 0 && angle < 90) answer = 1;
		else if(angle == 90) answer = 2;
		else if(angle > 90 && angle < 180) answer = 3;
		else if(angle == 180) answer = 4;
		
		System.out.println(answer);
	}

}
