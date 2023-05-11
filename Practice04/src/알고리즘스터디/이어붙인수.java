package 알고리즘스터디;

public class 이어붙인수 {

	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		
		//1. String으로 더해 int로 바꾼 값을 받고 그것을 계산
//		int odd = 0;
//		int even = 0;
//		for (int i = 0; i < num_list.length; i++) {
//			if(num_list[i] % 2 == 0) {
//				even = Integer.parseInt(even + "" + num_list[i]);
//			}
//			else if(num_list[i] % 2 > 0) {
//				odd = Integer.parseInt(odd + "" + num_list[i]);
//			}
//		}
//		answer = odd + even;
		
		//2. int를 String으로 바꿔서 값을 더하고 그것을 다시 int로 바꿔서 계산
//        String a = "";
//        String b = "";
//        for(int i = 0; i < num_list.length; i++){
//            if(num_list[i] % 2 == 0){
//                a += Integer.toString(num_list[i]);
//            } else if(num_list[i] % 2 > 0){
//                b += Integer.toString(num_list[i]);
//            }
//        }
//        
//        answer = Integer.parseInt(a) + Integer.parseInt(b);

		//3. 형변환 없이 푸는 방법
//		int odd = 0;
//		int even = 0;
//		for (int i = 0; i < num_list.length; i++) {
//			if(num_list[i] % 2 == 0) {
//				even = even * 10 + num_list[i];
//			}else if(num_list[i] % 2 > 0) {
//				odd = odd * 10 + num_list[i];
//			}
//		}
//		answer = odd + even;
		
		//4. 형변환 없이 for-each로 푸는 방법
		int odd = 0;
		int even = 0;
		for (int x : num_list) {
			if(x % 2 == 0) {
				even *= 10;
				even += x;
			}else if(x % 2 > 0) {
				odd *= 10;
				odd += x;
			}
		}
		answer = even + odd;
		
		System.out.println(answer);
	}

}
