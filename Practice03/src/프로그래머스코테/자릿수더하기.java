package 프로그래머스코테;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 123;
		int answer = 0;

		// 1. String 배열 이용
//		String n2 = Integer.toString(n);
//		String[] n3 = n2.split("");
//		for (String x : n3) {
//			answer += Integer.parseInt(x);
//		}

		// 2. while 과 % 이용
//		while(n != 0) {
//			answer += n % 10;
//			n /= 10;
//		}

		// 3. char배열과 아스키코드 이용 
			//'0'부터 '9'까지 아스키코드는 48부터 57 임 아스키코드값인 48을빼게 되면 
			// 그 차이만큼 반환되게 되는데, 그 차이가 숫자와 같아서 arr[i] - '0' 
			// 또는 arr[i] - 48로 형변환을 리소스를 크게 사용하지 않고 가능합니다.
//		char[] c = Integer.toString(n).toCharArray();
//			for (char x : c) {
//				answer += x - 48;
//			}
		
		//4. charAt이용
		String n2 = String.valueOf(n);
		for (int i = 0; i < n2.length(); i++) {
			answer += Integer.parseInt(String.valueOf(n2.charAt(i)));
		}
			
		System.out.println(answer);
	}

}
