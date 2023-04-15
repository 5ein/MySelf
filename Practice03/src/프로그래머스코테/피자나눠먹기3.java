package 프로그래머스코테;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		int slice = 4; 
		int n = 12;
		
		int answer = n / slice;
		
		if(n % slice != 0) answer =  n / slice + 1;
		
		System.out.println(answer);
	}

}
