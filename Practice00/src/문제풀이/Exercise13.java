package 문제풀이;

class Food extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음식먹기");
		}
	}
}

class TV implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("TV보기");
		}
	}
}

public class Exercise13 {
	
	public static void main(String[] args) {
		
		//클래스 Food 객체를 생성합니다.
		//클래스 TV 객체를 생성합니다.
		Food food = new Food();
		Thread tv = new Thread(new TV());
		
		//Food의 run()메소드를 실행합니다.
		//TV의 run()메소드를 실행합니다.
		food.start();
		tv.start();
	}
}
