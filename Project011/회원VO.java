package Project011;

public class 회원VO {
	private String ID;
	private String PW;
	
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}
	public void setPW(String PW) {
		this.PW = PW;
	}
	public String getPW() {
		return PW;
	}
	
	@Override
	public String toString() {
		return "관리자VO [ID=" + ID + ", PW=" + PW + "]";
	}
}
