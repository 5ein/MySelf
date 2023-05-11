package 알고리즘스터디;

public class 등차수열의특정한항만더하기 {

	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		int answer = 0;
		
		//for문
		for (int i = 0; i < included.length; i++) {
			if(included[i] == true) answer += (a + d * i);
		}
		
		System.out.println(answer);
	}

}
