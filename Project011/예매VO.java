package Project011;

public class 예매VO {
	
	private int NO;
	private String 공연ID;
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
	public void set공연ID(String 공연Id) {
		this.공연ID = 공연Id;
	}
	public String get회원ID() {
		return 회원ID;
	}
	public void set회원ID(String 회원Id) {
		this.회원ID = 회원Id;
	}
	
	@Override
	public String toString() {
		return "예매VO [NO=" + NO + ", 공연ID=" + 공연ID + ", 회원ID=" + 회원ID + "]";
	}
}
