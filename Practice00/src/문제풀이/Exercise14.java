package 문제풀이;

class Product<T> {
	private T component;
	
	public Product(T component) {
		this.component = component;
	}
	
	public T getComponent() {
		return component;
	}
	
	public void setComponent(T component) {
		this.component = component;
	}
}

class Monitor{
}

class Keyboard{
}

class Speaker{
}

public class Exercise14 {
	public static void main(String[] args) {
		
		//타입 파라미터를 Monitor 객체로 갖는 Product를 생성합니다.
		Product<Monitor> product1 = new Product<>(new Monitor());
		
		//타입 파라미터를 Keyboard 객체로 갖는 Product를 생성합니다.
		Product<Keyboard> product2 = new Product<>(new Keyboard());
		
		//타입 파라미터를 Speaker 객체로 갖는 Product를 생성합니다.
		Product<Speaker> product3 = new Product<Speaker>(new Speaker());
		
	}
}
