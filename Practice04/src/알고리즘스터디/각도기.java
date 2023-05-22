package 알고리즘스터디;

public class 각도기 {

	public static void main(String[] args) {
		int angle = 70;
		int answer = 0;

		//1. if-elseif 문
//		 if(angle > 0 && angle < 90) answer = 1;
//		 else if(angle == 90) answer = 2;
//		 else if(angle >90 && angle < 180) answer = 3;
//		 else if(angle == 180) answer = 4;
		
		//2. 삼항연산자
		 answer = (angle > 0 && angle < 90)? 1 : (angle == 90)? 2 : (angle >90 && angle < 180)? 3 : (angle == 180)? 4 : 0;
		
		System.out.println(answer);
	}

}
