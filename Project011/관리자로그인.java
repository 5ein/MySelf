package Project011;

import javax.swing.JOptionPane;

public class 관리자로그인 {

	public static void open() {
		// 로그인기능
		String ID = JOptionPane.showInputDialog("아이디 입력");
		String PW = JOptionPane.showInputDialog("패스워드 입력");

		관리자DAO dao = new 관리자DAO();

		// 보내는쪽
		// 1)가방을 만든다.
		관리자VO bag = new 관리자VO();
		
		// 2)가방에  입력한 값들을 넣자.(set()이용)
		bag.setID(ID);
		bag.setPW(PW);
		
		// 3)가방을 DAO에게 전달
		int result = dao.login(bag);
		if (result <= 1) {
			JOptionPane.showMessageDialog(null, "관리자로 로그인");
			공연정보UI 공연정보 = new 공연정보UI();
			공연정보.open();
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패 다시 로그인 하세요.");
		}
		
	}

}
