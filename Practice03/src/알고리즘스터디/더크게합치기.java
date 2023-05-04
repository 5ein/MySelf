package 알고리즘스터디;

public class 더크게합치기 {

	public static void main(String[] args) {
		int a = 9;
		int b = 91;
		int answer = 0;

		//1. Integer.parseInt()
//		String aa = Integer.toString(a);
//		String bb = Integer.toString(b);
//		int one = Integer.parseInt(aa + bb);
//		int two = Integer.parseInt(bb + aa);
//		
//		if(one < two) answer = two;
//		else answer = one;
		
		//2. Integer.valueOf()
		String aa = Integer.toString(a);
		int one = Integer.valueOf(aa + b);
		int two= Integer.valueOf(b + aa);
		if(one < two) answer = two;
		else answer = one;

		System.out.println(answer);
	}

}
