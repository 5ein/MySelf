package Project011;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class 회원DAO {
	// 로그인
		public int login(회원VO bag) {
			// 1. 가방을 받아서 변수에 넣어주세요.

			int result = 0; //없는 경우

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
				String sql = "select * from hr.회원 where ID = ? and PW = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				// 2. 가방에서 값들을 하나씩 꺼내쓰세요.
				ps.setString(1, bag.getID());
				ps.setString(2, bag.getPW());
				System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

				// 4. SQL문 오라클로 보내기
				ResultSet rs = ps.executeQuery(); // 성공하면 1이 나옴 //result를 이미 밖에서 선언 해줌, 값에 넣기만 하면됨
				System.out.println("4. SQL문 오라클로 보내기 성공.");
				if (rs.next()) {
					System.out.println("로그인 성공!");
					result = 1;
				}	
				ps.close(); 
				con.close(); 
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result; 
		} //login
}
