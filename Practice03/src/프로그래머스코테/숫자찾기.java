package 프로그래머스코테;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 232443;
		int k = 4;

	    int answer = -1;
		
//		String num2 = String.valueOf(num);
//		String k2 = String.valueOf(k);
//		if(num2.contains(k2)) answer = num2.indexOf(k2) + 1;
	    
	    String num2 = Integer.toString(num);
	    String[] num3 = num2.split("");
	    String k2 = Integer.toString(k);
	    
	    for (int i = 0; i < num3.length; i++) {
			if (num3[i].equals(k2)) {
				answer = i + 1;
				break;
			}
		}
	    
		System.out.println(answer);
	}

}
