package 프로그래머스코테;

public class 문제_369게임 {

	public static void main(String[] args) {
		int order = 29423;
		int answer = 0;
		
		//String x = order + ""; 으로도 스트링으로 바로 바꿀수 있음.
		
		String x = Integer.toString(order);
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if(c == '3' || c == '6' || c == '9') {
				answer++;
			}
		}

		System.out.println(answer);
	}
}
