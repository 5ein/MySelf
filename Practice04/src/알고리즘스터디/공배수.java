package 알고리즘스터디;

public class 공배수 {

	public static void main(String[] args) {
		int number = 55; 
		int n  = 10; 
		int m = 5;
		int answer = 0;
		
		answer = number % n == 0 && number % m == 0 ? 1 : 0;
		
		System.out.println(answer);
	}

}
