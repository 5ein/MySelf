package 알고리즘스터디;

public class 배열의평균값 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = 0;
		int j = 0;
		for (int i : numbers) {
			j += i;
		}
		
		answer = (double)j / numbers.length;
		
		System.out.println(answer);
	}

}
