package 프로그래머스코테;

public class 점의위치구하기 {

	public static void main(String[] args) {
		int[] dot = {2, 4};
		int answer = 0;
		
		if(dot[0] > 0) {
			if (dot[1] > 0) answer = 1;
			else if(dot[1] < 0) answer = 4;
		}else if(dot[0] < 0) {
			if (dot[1] > 0) answer = 2;
			else if(dot[1] < 0) answer = 3;
		}
		
		System.out.println(answer);
	}

}
