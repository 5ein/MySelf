package 알고리즘스터디;

public class 문자리스트를문자열로변환하기 {

	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		String answer = "";
		
		//1. for문 사용
//		for (int i = 0; i < arr.length; i++) {
//			answer += arr[i];
//		}
		
		//2. foreach문 사용
		for (String x : arr) {
			answer += x;
		}
		
		//3. StringBuilder 사용
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < arr.length; i++) {
//			sb.append(arr[i]);
//		}
//		answer = sb.toString();
		
		
		System.out.println(answer);
	}

}
