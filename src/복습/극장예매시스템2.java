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

public class 극장예매시스템2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("극장예매 시스템");
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.DARK_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font1 = new Font("12롯데마트드림Medium", Font.BOLD, 60);
		Font font2 = new Font("12롯데마트드림Medium", Font.BOLD, 20);
		Font font3 = new Font("12롯데마트드림Medium", Font.BOLD, 30);

		JLabel title = new JLabel("영화 예매 시스템");
		title.setForeground(Color.white);
		title.setFont(font1);
		f.add(title);

		JLabel result = new JLabel("예매할 좌석을 누르세요.");
		result.setForeground(Color.white);
		result.setFont(font3);

		JButton[] btn = new JButton[100];
		int[] seat = new int[btn.length];

		JButton reset = new JButton("reset");
		reset.setBackground(Color.pink);

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font2);

			f.add(btn[i]);
			f.add(reset);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					if (seat[no] == 1) {
						result.setText(text + "번 예매 불가");
						result.setForeground(Color.red);
					} else {
						seat[no] = 1;
						result.setText(text + "번 예매 완료");
						result.setForeground(Color.white);
					} // else
				} // if
			});
		} // for

		// 리셋눌렀을 때 리셋되는거해보기
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						seat[i] = 0;
					} // if
				} // for
				JOptionPane.showMessageDialog(f, "결제를 취소합니다.");
				result.setText("예매할 좌석을 누르세요.");
			}
		});

		f.add(result);

		JButton total = new JButton("전체 예매 내역");
		total.setBackground(Color.LIGHT_GRAY);
		total.setForeground(Color.black);
		f.add(total);

		JLabel result1 = new JLabel();
		result1.setForeground(Color.white);
		result1.setFont(font3);
		f.add(result1);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} // if
				} // for
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
			}
		});

		f.setVisible(true);
	}
}