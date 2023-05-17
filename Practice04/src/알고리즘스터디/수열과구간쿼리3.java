package 알고리즘스터디;

import java.util.Arrays;

public class 수열과구간쿼리3 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

		for (int i = 0; i < queries.length; i++) {
			int k = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = k;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
