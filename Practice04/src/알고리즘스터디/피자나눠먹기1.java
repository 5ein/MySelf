package 알고리즘스터디;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 7;
		int answer = n / 7;
		if(n % 7 != 0) answer = n / 7 + 1;
		
		System.out.println(answer);
	}

}
