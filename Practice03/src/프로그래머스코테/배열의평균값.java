package 프로그래머스코테;

public class 배열의평균값 {

	public static void main(String[] args) {
		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		
		double answer = 0;
		
		int total = 0;
		for(int i = 0; i <numbers.length; i++) {
			total = total + numbers[i];
		}
		answer = (double)total / numbers.length;
		System.out.println(answer);
	}

}
