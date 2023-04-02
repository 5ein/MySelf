package 문제풀이;

public class Exercise15 {
	
	public static void main(String[] args) {
		
		//인터페이스 Calc을 상속하여 sum메소들르 구현하는 람다식을 작성하세요
		//sum메소드는 인자로 전달된 x와 y를 더한 후 리턴하는 코드를 가집니다.
		Calc calc = (x, y) -> x + y;
		
		int result = calc.sum(5, 8);
		System.out.println("합계: " + result);
	}
}

interface Calc{
	public int sum(int x, int y);
}
