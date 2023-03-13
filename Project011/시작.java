package Project011;

import javax.swing.JOptionPane;

public class 시작 {

	public static void main(String[] args) {
		String choose = JOptionPane.showInputDialog("로그인: 관리자 / 회원  입력하십시오.");

		if (choose.equals("관리자")) {
			관리자로그인 관리자 = new 관리자로그인();
			관리자.open();
		} else if (choose.equals("회원")) {
			회원로그인 회원 = new 회원로그인();
			회원.open();
		} else {
			System.out.println("처음부터 다시 시도 해주세요.");
		}
	}
}
