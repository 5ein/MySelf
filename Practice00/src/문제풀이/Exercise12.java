package 문제풀이;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise12 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\homework\\eclipse\\Practice00\\src\\문제풀이\\Exercise12.txt"))){
			
			//Exercise12.txt 파일의 내용을 출력하는 코드를 완성하세요
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		}catch (Exception e) {
			System.out.println("오류발생");
		}
		
	}

}
