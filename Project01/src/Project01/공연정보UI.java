package Project01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class 공연정보UI {
	private static JTable table;
	private static JScrollPane scroll;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("공연정보");
		f.setSize(530, 600);
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		Font font1 = new Font("나눔스퀘어", Font.BOLD, 40);
		Font font2 = new Font("나눔스퀘어", Font.BOLD, 20);

		JLabel title = new JLabel("공연정보");
		JLabel l1 = new JLabel("공연ID");
		JLabel l2 = new JLabel("제   목");
		JLabel l3 = new JLabel("위   치");
		JLabel l4 = new JLabel("가   격");
		JLabel l5 = new JLabel("시작일");
		JLabel l6 = new JLabel("종료일");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);

		JButton b1 = new JButton("공연 추가");
		JButton b2 = new JButton("공연 검색");
		JButton b3 = new JButton("공연 수정");
		JButton b4 = new JButton("공연 삭제");

		b1.setPreferredSize(new Dimension(200, 50));
		b2.setPreferredSize(new Dimension(200, 50));
		b3.setPreferredSize(new Dimension(200, 50));
		b4.setPreferredSize(new Dimension(200, 50));

		title.setFont(font1);
		l1.setFont(font2);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		t5.setFont(font2);
		t6.setFont(font2);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);

		// 공연정보 불러오기---
		JPanel panel = new JPanel();

		JButton b = new JButton("🔃"); // 새로고침버튼
		b.setPreferredSize(new Dimension(55, 50));
		b.setFont(font2);
		b.setBackground(Color.darkGray);
		b.setForeground(Color.white);
		b.setHorizontalAlignment(SwingConstants.CENTER);

		공연정보DAO dao = new 공연정보DAO();
		ArrayList<공연정보VO> list = dao.list();

		String[] header = { "ID", "공연제목", "위치", "가격", "공연시작일", "공연종료일" };
		Object[][] all = new Object[list.size()][6];
		if (list.size() > 0) {
			for (int i = 0; i < all.length; i++) {
				all[i][0] = list.get(i).getID();
				all[i][1] = list.get(i).get제목();
				all[i][2] = list.get(i).get위치();
				all[i][3] = list.get(i).get가격();
				all[i][4] = list.get(i).get공연시작일();
				all[i][5] = list.get(i).get공연종료일();
			}
		}

		table = new JTable(all, header);
		table.setPreferredSize(new Dimension(500, 250));

		scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(500, 250));

		panel.add(scroll);

		// 새로고침
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				공연정보DAO dao = new 공연정보DAO();
				ArrayList<공연정보VO> list = dao.list();

				String[] header = { "ID", "공연제목", "위치", "가격", "공연시작일", "공연종료일" };
				Object[][] all = new Object[list.size()][6];
				if (list.size() > 0) {
					for (int i = 0; i < all.length; i++) {
						all[i][0] = list.get(i).getID();
						all[i][1] = list.get(i).get제목();
						all[i][2] = list.get(i).get위치();
						all[i][3] = list.get(i).get가격();
						all[i][4] = list.get(i).get공연시작일();
						all[i][5] = list.get(i).get공연종료일();
					}
				}

				table = new JTable(all, header);
				table.setPreferredSize(new Dimension(500, 250));

				scroll = new JScrollPane(table);
				scroll.setPreferredSize(new Dimension(500, 250));

				panel.removeAll();
				panel.add(scroll);
				panel.revalidate();

				// 테이블 눌렀을때 행 전체 JOptinonPane으로 보이게 하기
				table.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// 클릭한 위치의 행번호
						int rowNo = table.getSelectedRow();

						Object ID = table.getModel().getValueAt(rowNo, 0);// 0,0
						Object 제목 = table.getModel().getValueAt(rowNo, 1);// 0,1
						Object 위치 = table.getModel().getValueAt(rowNo, 2);// 0,2
						Object 가격 = table.getModel().getValueAt(rowNo, 3);// 0,3
						Object 공연시작일 = table.getModel().getValueAt(rowNo, 4);// 0,4
						Object 공연종료일 = table.getModel().getValueAt(rowNo, 5);// 0,5
						JOptionPane.showMessageDialog(table,
								ID + " | " + 제목 + " | " + 위치 + " | " + 가격 + " | " + 공연시작일 + " | " + 공연종료일);
					}
				});
			}
		});

		// 테이블 눌렀을때 행 전체 JOptinonPane으로 보이게 하기
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// 클릭한 위치의 행번호
				int rowNo = table.getSelectedRow();

				Object ID = table.getModel().getValueAt(rowNo, 0);// 0,0
				Object 제목 = table.getModel().getValueAt(rowNo, 1);// 0,1
				Object 위치 = table.getModel().getValueAt(rowNo, 2);// 0,2
				Object 가격 = table.getModel().getValueAt(rowNo, 3);// 0,3
				Object 공연시작일 = table.getModel().getValueAt(rowNo, 4);// 0,4
				Object 공연종료일 = table.getModel().getValueAt(rowNo, 5);// 0,5
				JOptionPane.showMessageDialog(table,
						ID + " | " + 제목 + " | " + 위치 + " | " + 가격 + " | " + 공연시작일 + " | " + 공연종료일);
			}
		});

		// -- 공연정보

		// 공연 추가
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String ID = t1.getText();
				String 제목 = t2.getText();
				String 위치 = t3.getText();
				String 가격 = t4.getText();
				String 공연시작일 = t5.getText();
				String 공연종료일 = t6.getText();

				if (ID.equals("")) {
					JOptionPane.showMessageDialog(f, "ID는 필수입력 항목입니다.");
				}
				공연정보DAO dao = new 공연정보DAO();

				공연정보VO bag = new 공연정보VO();
				bag.setID(ID);
				bag.set제목(제목);
				bag.set위치(위치);
				bag.set가격(가격);
				bag.set공연시작일(공연시작일);
				bag.set공연종료일(공연종료일);

				int result = dao.insert(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "공연 추가 성공");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "공연 추가 실패");
				}
			}
		});// b1

		// 공연ID 검색하기
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String ID = t1.getText();

				공연정보DAO dao = new 공연정보DAO();
				공연정보VO bag = dao.one(ID);
				if (bag != null) {
					t2.setText(bag.get제목());
					t3.setText(bag.get위치());
					t4.setText(bag.get가격());
					t5.setText(bag.get공연시작일());
					t6.setText(bag.get공연종료일());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
					t5.setBackground(Color.pink);
					t6.setBackground(Color.pink);
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 업음");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				}
			}
		});// b2

		// 공연정보 수정
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String ID = t1.getText(); // 조건
				String 제목 = t2.getText(); // 바꾸는 항목 들
				String 위치 = t3.getText();
				String 가격 = t4.getText();
				String 공연시작일 = t5.getText();
				String 공연종료일 = t6.getText();

				공연정보DAO dao = new 공연정보DAO();

				공연정보VO bag = new 공연정보VO();

				bag.setID(ID);
				bag.set제목(제목);
				bag.set위치(위치);
				bag.set가격(가격);
				bag.set공연시작일(공연시작일);
				bag.set공연종료일(공연종료일);

				int result = dao.update(bag);

				if (result == 1) {
					JOptionPane.showMessageDialog(f, "공연수정 성공");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "공연수정 실패, 재입력 해주세요.");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				}
			}
		});// b3

		// 공연정보 삭제
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ID = t1.getText();

				공연정보DAO dao = new 공연정보DAO();
				int result = dao.delete(ID);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "공연삭제 성공");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "공연삭제 실패, 재입력 해주세요");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				}
			}
		});

		f.add(title); f.add(b);
		f.add(panel, BorderLayout.CENTER);
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);
		f.add(l4); f.add(t4);
		f.add(l5); f.add(t5);
		f.add(l6); f.add(t6);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);

		f.setVisible(true);
	}

}
