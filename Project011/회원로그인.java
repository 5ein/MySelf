package Project011;

import javax.swing.JOptionPane;

public class 회원로그인 {

	public static void open() {
		// 로그인기능
		String ID = JOptionPane.showInputDialog("아이디 입력");
		String PW = JOptionPane.showInputDialog("패스워드 입력");

		회원DAO dao = new 회원DAO();

		// 보내는쪽
		// 1)가방을 만든다.
		회원VO bag = new 회원VO();
		
		// 2)가방에  입력한 값들을 넣자.(set()이용)
		bag.setID(ID);
		bag.setPW(PW);
		
		// 3)가방을 DAO에게 전달
		int result = dao.login(bag);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "회원으로 로그인");
			예매UI 예매창 = new 예매UI();
			예매창.open(ID);
			
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
	}

}
