package 알고리즘스터디;

import java.util.Arrays;

public class 수열과구간쿼리2 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

		int[] answer = new int[queries.length]; // queries의 길이만큼의 배열을 생성하여 답을 저장할 것입니다.
		
		for(int i = 0; i < queries.length; i++) {
			int s = queries[i][0]; // 쿼리의 시작 인덱스
            int e = queries[i][1]; // 쿼리의 끝 인덱스
            int k = queries[i][2]; // 쿼리에서 찾아야 하는 값

			int[] subArr = Arrays.copyOfRange(arr, s, e+1);
			Arrays.sort(subArr);
			
			int answerIdx = -1;
			
			for (int j = 0; j < subArr.length; j++) {
				if(subArr[j] > k) {
					answerIdx = subArr[j];
					break;
				}
			}
			answer[i] = answerIdx;
			
		}
		

		
		System.out.println(Arrays.toString(answer));
	}

}
