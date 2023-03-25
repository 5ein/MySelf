package 복습;

public class 직원 {
	public String name;
	String address;
	protected int salary;
	private String rrn;
	
	public String getRrn() {
		return rrn;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
