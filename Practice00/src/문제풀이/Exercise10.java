package 문제풀이;

import java.util.HashMap;

public class Exercise10 {

	public static void main(String[] args) {
		String key[] = {"고진감래", "분골쇄신", "권토중래", "교학상자"};
		String meaning[] = {"고생 끝에 즐거움이 옴", "몸이 부서질정도로 노력을 다함", 
							"실패를 발판삼아 재기함", "가르치고 배우면서 서로 성장함"};
		
		HashMap<String, String> dic;
		
		//dic에 key와 value를 저장하는 코들르 구현하세요.
		dic = new HashMap<String, String>();
		
		for (int i = 0; i < key.length; i++) {
			dic.put(key[i], meaning[i]);
		}
		
		String result = dic.get("고진감래");
		System.out.println(result);
	}

}
