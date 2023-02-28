package review;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();
		//public : 아무곳에서나 접근 가능
		work.name = "홍길동"; 
		
		//default : 같은 패키지 안에서만 접근 가능
		work.address = "한남동";
		
		//protected : 같은패키지 이거나 상속받은 다른패키지일 경우 접근가능
		work.salary = 100;
		
		//private :  해당 클래스 안에서만 접근가능
//		work.rrn = "110230"; //다른 클래스이기 때문애 사용 불가
		
		//앞에서 toString 해줬기 때문에 주소가 나오지 않고 값이 나옴!
		System.out.println(work);

	}

}
