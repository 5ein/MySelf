package 알고리즘스터디;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int answer = 0;
		
		answer = n * 12000 + (k - n/10) * 2000;
		
		System.out.println(answer);
	}

}
