package 복습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {

	// 가입
	public int insert(MemberVO bag) {
		//1. 가방을 받아서 변수에 넣는다.
		
		int result = 0;

		try {
			// 1. 커넥터 설정: 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. DB연결: 오라클 11g에 연결 (Java --- Oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문 만들기
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는것을 sql부품으로 만들어 줌
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// 4. SQL문을 Oracle로 전송
			result = ps.executeUpdate();
			System.out.println("4. SQL문 Oracle로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result; // void 바꿔주기 //result변수를 전달하는 것이 아니고 0,1인 값만 전달

	}

	// 수정
	public int update(MemberVO bag) {
		int result = 0;

		try {
			// 1. 커넥터 설정: 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. DB연결: 오라클 11g에 연결 (Java --- Oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문 만들기
			String sql = "update hr.MEMBER set pw = ?, name = ?, tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는것을 sql부품으로 만들어 줌
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getTel());
			ps.setString(4, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// 4. SQL문을 Oracle로 전송
			result = ps.executeUpdate();
			System.out.println("4. SQL문 Oracle로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원수정 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result; // void 바꿔주기 //result변수를 전달하는 것이 아니고 0,1인 값만 전달

	}

	// 탈퇴
	public int delete(String id) {
		int result = 0;

		try {
			// 1. 커넥터 설정: 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. DB연결: 오라클 11g에 연결 (Java --- Oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문 만들기
			String sql = "delete hr.MEMBER where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는것을 sql부품으로 만들어 줌
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// 4. SQL문을 Oracle로 전송
			result = ps.executeUpdate();
			System.out.println("4. SQL문 Oracle로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원탈퇴 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result; // void 바꿔주기 //result변수를 전달하는 것이 아니고 0,1인 값만 전달

	}

}
