package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("회원관리");
		f.setSize(350, 350);
		f.getContentPane().setBackground(Color.lightGray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("12롯데마트행복Medium", Font.BOLD, 30);
		Font font1 = new Font("12롯데마트행복Medium", Font.BOLD, 25);
		Font font2 = new Font("12롯데마트행복Medium", Font.BOLD, 20);

		JLabel title = new JLabel("<< 회원관리 시스템 >>"); // 타이틀
		JLabel l1 = new JLabel("아 이 디"); // ID
		JLabel l2 = new JLabel("비밀번호"); // PW
		JLabel l3 = new JLabel("닉 네 임"); // name
		JLabel l4 = new JLabel("전화번호"); // tel

		JTextField t1 = new JTextField(8); // ID
		JTextField t2 = new JTextField(8); // PW
		JTextField t3 = new JTextField(8); // name
		JTextField t4 = new JTextField(8); // tel

		JButton b1 = new JButton("회원가입"); // 회원가입
		JButton b2 = new JButton("회원수정"); // 회원수정
		JButton b3 = new JButton("회원검색"); // 회원검색
		JButton b4 = new JButton("회원탈퇴"); // 회원탈퇴

		title.setFont(font);
		l1.setFont(font1);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);
		t1.setFont(font1);
		t1.setBackground(Color.white);
		t2.setFont(font1);
		t2.setBackground(Color.white);
		t3.setFont(font1);
		t3.setBackground(Color.white);
		t4.setFont(font1);
		t4.setBackground(Color.white);
		b1.setFont(font2);
		b1.setBackground(Color.white);
		b2.setFont(font2);
		b2.setBackground(Color.white);
		b3.setFont(font2);
		b3.setBackground(Color.white);
		b4.setFont(font2);
		b4.setBackground(Color.white);

		f.add(title);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 가입
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입 처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				MemberDAO dao = new MemberDAO();
				
				//1. 가방을 만든다.
				MemberVO bag = new MemberVO();
				
				//2. 가방에 값을 넣는다.
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
				//3. 값들이 들어있는 가방을 전달한다.
				int result = dao.insert(bag); // 성공:1, 실패:0
				
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패");
				}
			}
		}); // b1

		// 수정
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정 처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				MemberDAO dao = new MemberDAO();
				
				//1. 가방을 만든다.
				MemberVO bag = new MemberVO();
				
				//2. 가방에 값을 넣는다.
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
				//3. 값들이 들어있는 가방을 전달한다.
				int result = dao.update(bag); // 성공:1, 실패:0
				
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원수정 실패");
				}
			}
		}); // b2

		// 탈퇴
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴 처리");
				String id = t1.getText();

				MemberDAO dao = new MemberDAO();
				int result = dao.delete(id); // 성공:1, 실패:0
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패");
				}
			}
		}); // b4

		f.setVisible(true);
	}
}
