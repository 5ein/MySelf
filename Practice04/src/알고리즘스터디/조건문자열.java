package 알고리즘스터디;

public class 조건문자열 {

	public static void main(String[] args) {
		String ineq = "<"; 
		String eq = "=";
		int n = 20;
		int m = 50;
		int answer = 0;

		//1. 
//		if(ineq.equals(">")){
//            if(eq.equals("=")) {
//                answer = n >= m ? 1 : 0;
//            }else { 
//                answer = n > m ? 1 : 0;
//            }
//        }else {
//            if(eq.equals("=")) {
//                answer = n <= m ? 1 : 0;
//            }else { 
//                answer = n < m ? 1 : 0;
//            }
//        }
		
		//2. 
//		if(ineq.equals("<")) {
//			answer = eq.equals("=")? (n <= m ? 1 : 0) : (n < m ? 1 : 0);
//		}else {
//			answer = eq.equals("=")? (n >= m ? 1 : 0) : (n > m ? 1 : 0);
//		}
		
		//3. 
		answer = ineq.equals("<")? (eq.equals("=")? (n <= m ? 1 : 0) : (n < m ? 1 : 0)) : (eq.equals("=")? (n >= m ? 1 : 0) : (n > m ? 1 : 0));
		
		
		System.out.println(answer);
	}

}
