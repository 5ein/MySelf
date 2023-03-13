package Project011;

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

public class 예매UI {
	private static JTable table;
	private static JScrollPane scroll;
	private static JTable table1;
	private static JScrollPane scroll1;
	
	public static void open(String ID) {
		JFrame f = new JFrame();
		f.setTitle("예매");
		f.setSize(530, 830);
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		Font font1 = new Font("나눔스퀘어", Font.BOLD, 40);
		Font font2 = new Font("나눔스퀘어", Font.BOLD, 20);
		
		JLabel title = new JLabel("<<<<<공연 목록>>>>>");
		JLabel l1 = new JLabel("공연 ID");
		JLabel l2 = new JLabel("회원 ID");
		JLabel title2 = new JLabel("<<<<<예매 내역>>>>>");
		JLabel l3 = new JLabel("주문번호");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setText(ID);
		JTextField t3 = new JTextField(10);
		
		JButton b1 = new JButton("공연예매");
		JButton b2 = new JButton("예매취소");
		JButton b = new JButton("🔃");
		
		title.setFont(font1);
		title2.setFont(font1);
		l1.setFont(font2);
		l2.setFont(font2);
		l3.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		b1.setFont(font2);
		b2.setFont(font2);
		b.setFont(font2);
		
		b.setBackground(Color.darkGray);
		b.setForeground(Color.white);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		
		b1.setPreferredSize(new Dimension(220, 40));
		b2.setPreferredSize(new Dimension(220, 40));
		
		// 공연정보 불러오기---
		JPanel panel = new JPanel();
		예매DAO dao = new 예매DAO();
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
		//-- 공연정보
		
		//예매목록 불러오기 --
		JPanel panel1 = new JPanel();
		예매DAO dao1 = new 예매DAO();
		ArrayList<예매결과VO> list1 = dao1.list1();

		String[] header1 = { "주문번호", "공연ID", "제목", "위치", "회원ID" };
		Object[][] all1 = new Object[list1.size()][5];
		if (list1.size() > 0) {
			for (int i = 0; i < all1.length; i++) {
				all1[i][0] = list1.get(i).getNO();
				all1[i][1] = list1.get(i).get공연ID();
				all1[i][2] = list1.get(i).get제목();
				all1[i][3] = list1.get(i).get위치();
				all1[i][4] = list1.get(i).get회원ID();
			}
		}

		table1 = new JTable(all1, header1);
		table1.setPreferredSize(new Dimension(500, 250));

		scroll1 = new JScrollPane(table1);
		scroll1.setPreferredSize(new Dimension(500, 250));

		panel1.add(scroll1);
		
		// 새로고침
				b.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						예매DAO dao1 = new 예매DAO();
						ArrayList<예매결과VO> list1 = dao1.list1();

						String[] header1 = { "주문번호", "공연ID", "제목", "위치", "회원ID" };
						Object[][] all1 = new Object[list1.size()][5];
						if (list1.size() > 0) {
							for (int i = 0; i < all1.length; i++) {
								all1[i][0] = list1.get(i).getNO();
								all1[i][1] = list1.get(i).get공연ID();
								all1[i][2] = list1.get(i).get제목();
								all1[i][3] = list1.get(i).get위치();
								all1[i][4] = list1.get(i).get회원ID();
							}
						}

						table1 = new JTable(all1, header1);
						table1.setPreferredSize(new Dimension(500, 250));

						scroll1 = new JScrollPane(table1);
						scroll1.setPreferredSize(new Dimension(500, 250));

						panel1.removeAll();
						panel1.add(scroll1);
						panel1.revalidate();

						// 테이블 눌렀을때 행 전체 JOptinonPane으로 보이게 하기
						table1.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent e) {
								// 클릭한 위치의 행번호
								int rowNo1 = table1.getSelectedRow();

								Object NO = table.getModel().getValueAt(rowNo1, 0);// 0,0
								Object 공연ID = table.getModel().getValueAt(rowNo1, 1);// 0,1
								Object 회원ID = table.getModel().getValueAt(rowNo1, 2);// 0,2
								JOptionPane.showMessageDialog(table1, NO + " | " + 공연ID + " | " + 회원ID);
							}
						});
					}
				});
				
				// 테이블 눌렀을때 행 전체 JOptinonPane으로 보이게 하기
				table1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// 클릭한 위치의 행번호
						int rowNo1 = table1.getSelectedRow();

						Object NO = table.getModel().getValueAt(rowNo1, 0);// 0,0
						Object 공연ID = table.getModel().getValueAt(rowNo1, 1);// 0,1
						Object 회원ID = table.getModel().getValueAt(rowNo1, 2);// 0,2
						JOptionPane.showMessageDialog(table1, NO + " | " + 공연ID + " | " + 회원ID);
					}
				});
		
		//-- 예매 목록
				
		// 예매하기--
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String 공연ID = t1.getText();
				String 회원ID = t2.getText();

				예매DAO dao = new 예매DAO();
				
				예매VO bag = new 예매VO();
				bag.set공연ID(공연ID);
				bag.set회원ID(회원ID);

				int result = dao.insert(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "예매 성공");
					t1.setText("");
					t2.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "예매 실패");
				}
			}
		});// -- b1 예매하기
		
		// 예매 취소 --
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String NO = t3.getText();

				예매DAO dao = new 예매DAO();
				int result = dao.delete(NO);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "예매취소");
					t3.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "예매취소 실패, 재입력 해주세요");
					t3.setText("");
				}
			}
		}); //-- b2 예매 취소
		
		
		f.add(title);
		f.add(panel, BorderLayout.CENTER);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(title2);
		f.add(b);
		f.add(panel1, BorderLayout.CENTER);
		f.add(l3);
		f.add(t3);
		f.add(b2);
		
		f.setVisible(true);
	}

}
