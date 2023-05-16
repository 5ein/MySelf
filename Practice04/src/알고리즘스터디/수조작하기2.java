package 알고리즘스터디;

public class 수조작하기2 {

	public static void main(String[] args) {
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String answer = "";
        
        //1.
//        for (int i = 1; i < numLog.length; i++) {
//			if(numLog[i-1] + 1 == numLog[i]) answer += "w";
//			else if(numLog[i-1] - 1 == numLog[i]) answer += "s";
//            else if(numLog[i-1] + 10 == numLog[i]) answer += "d";
//            else answer += "a";
//		}
        
        //2. 다른사람 풀이
        for(int i = 0; i< numLog.length-1; i++){
            int j = i+1;
            if(j == numLog.length) break;
            if(numLog[i] + 1 == numLog[j]){answer += "w";}
            if(numLog[i] - 1 == numLog[j]){ answer += "s";}
            if(numLog[i] + 10 == numLog[j]){ answer += "d";}
            if(numLog[i] - 10 == numLog[j]){ answer += "a";}
        }
		
		System.out.println(answer);
	}

}
