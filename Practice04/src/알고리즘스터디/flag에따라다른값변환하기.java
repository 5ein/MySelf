package 알고리즘스터디;

public class flag에따라다른값변환하기 {

	public static void main(String[] args) {
		int a = -4;
		int b = 7;
		boolean flag = true;
		int answer = 0;
		
		//1.
//		if(flag == true) answer = a + b;
//        else answer = a - b;
		
		//2.
		answer = flag == true ? a + b : a - b;
		
		System.out.println(answer);
	}

}
