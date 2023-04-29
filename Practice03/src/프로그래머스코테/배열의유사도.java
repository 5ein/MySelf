package 프로그래머스코테;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = 0;
		
		//이중for문 이용
		for (String x : s1) {
			for (String y : s2) {
				if(x.equals(y)) answer++;
			}
		}
		
		//List이용
//		List<String> list = Arrays.asList(s1);
//		for (String x : s2) {
//			if (list.contains(x)) answer++;
//		}
		
		System.out.println(answer);
	}

}
