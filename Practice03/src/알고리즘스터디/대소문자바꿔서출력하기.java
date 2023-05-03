package 알고리즘스터디;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			
			if (Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
			}else if(Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			}
		}
        System.out.println(result);
        sc.close();
	}

}
