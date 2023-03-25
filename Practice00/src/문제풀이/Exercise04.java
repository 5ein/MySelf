package 문제풀이;

public class Exercise04 {

	public static void main(String[] args) {
		int[] score = { 90, 85, 78, 100, 98 };

		int sum = 0; // 총점
		double avg = 0.0; // 평균
		int max = 0; // 최대값
		int min = 999; // 최소값

		// 총점, 평균, 최대값, 최소값을 구합니다.
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i];
		}

		avg = (double)sum / score.length;

		System.out.println("총  점: " + sum);
		System.out.println("평  균: " + avg);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}

}
