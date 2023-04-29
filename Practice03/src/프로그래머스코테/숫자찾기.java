package 프로그래머스코테;


public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 232443;
		int k = 4;

	    int answer = 0;
		
		String num2 = String.valueOf(num);
		String k2 = String.valueOf(k);
		
		if(num2.contains(k2)) answer = num2.indexOf(k2) + 1;
		else answer = -1;
		
		System.out.println(answer);
	}

}
