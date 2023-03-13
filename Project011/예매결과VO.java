package Project011;

public class 예매결과VO {
	
	private int NO;
	private String 공연ID;
	private String 제목;
	private String 위치;
	private String 회원ID;
	
	public int getNO() {
		return NO;
	}
	public void setNO(int NO) {
		this.NO = NO;
	}
	public String get공연ID() {
		return 공연ID;
	}
	public void set공연ID(String 공연ID) {
		this.공연ID = 공연ID;
	}
	public String get제목() {
		return 제목;
	}
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	public String get위치() {
		return 위치;
	}
	public void set위치(String 위치) {
		this.위치 = 위치;
	}
	public String get회원ID() {
		return 회원ID;
	}
	public void set회원ID(String 회원ID) {
		this.회원ID = 회원ID;
	}
	@Override
	public String toString() {
		return "예매결과VO [NO=" + NO + ", 공연ID=" + 공연ID + ", 제목=" + 제목 + ", 위치=" + 위치 + ", 회원ID=" + 회원ID + "]";
	}
	
	
	
}
