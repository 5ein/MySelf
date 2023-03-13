package Project011;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class 예매DAO {

	// 공연정보 가져오기
	public ArrayList<공연정보VO> list() { // 검색하려면 ()안에 적어주기
		ResultSet rs = null; // 항목명 + 결과데이터를 담고있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList
		ArrayList<공연정보VO> list = new ArrayList<>(); // 앞 꺽쇠에 뭘가져올지 적는것
		// ArrayList<공연정보VO> ==> 공연정보VO만 들어간 arraylist라는 의미

		공연정보VO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3.
			String sql = "select * from hr.공연정보"; // 조건주지 않고 다 가져옴
			PreparedStatement ps = con.prepareStatement(sql);
			// ps.setString(1, id); //?가 없어졌기 때문에 필요없음 삭제!
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4.
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색결과가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 가져오자
				String ID = rs.getString(1);
				String 제목 = rs.getString(2);
				String 위치 = rs.getString(3);
				String 가격 = rs.getString(4);
				String 공연시작일 = rs.getString(5);
				String 공연종료일 = rs.getString(6);
				// System.out.println(id2 + " " + pw + " " + name + " " + tel);
				// 검색결과를 검색화면 UI부분에 넣어주어야 함. (여기에jop넣으면 안됨)
				// 3. 가방을 만들자
				bag = new 공연정보VO(); // 가방만들어서
				bag.setID(ID); // 가방에다 쫙 넣자
				bag.set제목(제목);
				bag.set위치(위치);
				bag.set가격(가격);
				bag.set공연시작일(공연시작일);
				bag.set공연종료일(공연종료일);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			} // while로 바뀌었기 때문에 if-else의 else삭제!
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXX! ==> 파이썬만 가능
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함 ==> 자바는 가방을 만들어줘야함
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;
	}

	// 예매정보 가져오기
	public ArrayList<예매결과VO> list1() { // 검색하려면 ()안에 적어주기
		ResultSet rs = null; // 항목명 + 결과데이터를 담고있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList
		ArrayList<예매결과VO> list1 = new ArrayList<>(); // 앞 꺽쇠에 뭘가져올지 적는것
		// ArrayList<공연정보VO> ==> 공연정보VO만 들어간 arraylist라는 의미

		예매결과VO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3.
			String sql = "SELECT a.\"NO\" AS 주문번호, a.공연ID, b.제목, b.위치, a.회원ID \r\n" + 
						"FROM hr.예매 a, hr.공연정보 b \r\n" + 
						"WHERE a.공연ID = b.ID ";
			PreparedStatement ps = con.prepareStatement(sql);
			// ps.setString(1, id); //?가 없어졌기 때문에 필요없음 삭제!
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4.
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색결과가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 가져오자
				int NO = rs.getInt(1);
				String 공연ID = rs.getString(2);
				String 제목 = rs.getString(3);
				String 위치 = rs.getString(4);
				String 회원ID = rs.getString(5);
				// System.out.println(id2 + " " + pw + " " + name + " " + tel);
				// 검색결과를 검색화면 UI부분에 넣어주어야 함. (여기에jop넣으면 안됨)
				// 3. 가방을 만들자
				bag = new 예매결과VO(); // 가방만들어서
				bag.setNO(NO); // 가방에다 쫙 넣자
				bag.set공연ID(공연ID);
				bag.set제목(제목);
				bag.set위치(위치);
				bag.set회원ID(회원ID);

				// 4. list1에 bag을 추가해주자.
				list1.add(bag);
			} // while로 바뀌었기 때문에 if-else의 else삭제!
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXX! ==> 파이썬만 가능
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함 ==> 자바는 가방을 만들어줘야함
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list1;
	}

	// 예매 추가하기 insert
	public int insert(예매VO bag) {

		int result = 0;

		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문 부품(객체)으로 만들어주기
			String sql = "insert into hr.예매 values (hr.r_seq.nextVal, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// 2. 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.get공연ID());
			ps.setString(2, bag.get회원ID());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// 4. SQL문 오라클로 보내기
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("예매 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	// 예매 취소하기 delete
	public int delete(String NO) {

		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3.
			String sql = "delete from hr.예매 where NO = ? "; // 관리자로 바꿔야하나?
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, NO);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4.
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("예매취소 성공.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
}
