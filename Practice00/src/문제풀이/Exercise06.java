package 문제풀이;

public class Exercise06 {

	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor("mark6", 180);
		
		//출력: mark0:200 으로 되게 만들기
		System.out.println(suit1.getName() + ":" + suit1.getHeight());
		
		//출력: mark6:180
		System.out.println(suit2.getName() + ":" + suit2.getHeight());
	}

}

class Armor{
	private String name;
	private int height;
	
	public Armor() {
		name = "mark0";
		height = 200;
	}
	
	public Armor(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}