package 알고리즘스터디;

public class 코드처리하기 {

	public static void main(String[] args) {
		String code = "abc1abc1abc";

		// 1.StringBuilder 클래스를 사용하여 문자열을 빌드하는 방법
//		String answer = "";
//		StringBuilder ret = new StringBuilder();
//		int mode = 0;
//		
//		for (int i = 0; i < code.length(); i++) {
//			if(code.charAt(i) == '1') mode = 1 - mode;
//			else {
//				if (mode == 0 && i % 2 == 0) {
//					ret.append(code.charAt(i));
//				} else if (mode == 1 && i % 2 == 1) {
//					ret.append(code.charAt(i));
//				}
//			}
//		}
//		if(ret.length() == 0) answer = "EMPTY";
//		else answer = ret.toString();
//		System.out.println(answer);

		// 2. String 클래스를 사용하여 문자열을 연결하는 방법
//		String answer = "";
//		int mode = 0;
//
//		for (int idx = 0; idx < code.length(); idx++) {
//			if (code.charAt(idx) == '1') {
//				mode = 1 - mode;
//			} else {
//				if (mode == 0 && idx % 2 == 0) {
//					answer += code.charAt(idx);
//				} else if (mode == 1 && idx % 2 == 1) {
//					answer += code.charAt(idx);
//				}
//			}
//		}
//
//		if (answer.length() == 0) {
//			answer = "EMPTY";
//		}
//		System.out.println(answer);

		//3. char 배열을 사용하여 문자열을 빌드하는 방법:
	    char[] retArray = new char[code.length()];
	    int retIndex = 0;
	    int mode = 0;
	    
	    for (int i = 0; i < code.length(); i++) {
	        if (code.charAt(i) == '1') {
	            mode = 1 - mode;
	        } else {
	            if (mode == 0 && i % 2 == 0) {
	                retArray[retIndex] = code.charAt(i);
	                retIndex++;
	            } else if (mode == 1 && i % 2 == 1) {
	                retArray[retIndex] = code.charAt(i);
	                retIndex++;
	            }
	        }
	    }
	    
	    String ret = new String(retArray, 0, retIndex);
	    
	    if (ret.length() == 0) {
	        System.out.println("EMPTY");
	    } else {
	    	System.out.println(ret);
	    }
				
		
		// 실패 (이유 찾아보기)
//		int mode = 0;
//        String[] s = code.split("");
//        
//        for(int i = 0; i < s.length; i++){
//            if(s[i].equals("1")){
//                if(mode == 0) mode = 1;
//                else mode = 0;
//            }
//        }
//        
//        for(int i = 0; i < s.length; i++){
//            if(mode == 0){
//            	if(!s[i].equals("1") && i % 2 == 0) answer += s[i];
//            	else if(s[i].equals("1"))mode = 1;
//            }else {
//            	if(!s[i].equals("1") && i % 2 == 1) answer += s[i];
//            	else if(s[i].equals("1"))mode = 0;
//            }
//        }
//        
//        if(answer.equals("")) answer = "EMPTY";
	    
	    
	    
	}

}
