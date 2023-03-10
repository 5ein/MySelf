package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템5 {
	//튜닝 더해보기, 할인기능 추가

	static int[] count = new int[4];

	final static int[] PRICE = { 1000, 6000, 5000, 5500 };// 짬뽕 우동 짜장

	static String[] food = { "짬뽕", "우동", "짜장" };
	static String[] icons = { "111.png", "222.png", "333.png" };
	static JButton[] buttons = new JButton[3];
	static JLabel[] labels = new JLabel[3];
	static String[] text = { "개수: ", "", "결제금액: 0원" };

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("중국집 주문 키오스크");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.black);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("12롯데마트드림Medium", 1, 20);

		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(text[i]);
			labels[i].setFont(font);
			labels[i].setForeground(Color.white);
		}
		ImageIcon icon = new ImageIcon("home.png");
		labels[1].setIcon(icon);

		JButton number = new JButton("0개");
		number.setFont(font);
		number.setForeground(Color.white);
		number.setBackground(Color.gray);

		for (int i = 0; i < food.length; i++) {
			buttons[i] = new JButton(food[i]);
			buttons[i].setFont(font);
			buttons[i].setBackground(Color.darkGray);
			buttons[i].setForeground(Color.white);
			f.add(buttons[i]);

			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = e.getActionCommand();
					int index = 0;
					if (name.equals("짬뽕")) {
						index = 1;
					} else if (name.equals("우동")) {
						index = 2;
					} else {
						index = 3;
					}
					ImageIcon icon = new ImageIcon(icons[index - 1]);
					labels[1].setIcon(icon);
					count[0]++;
					number.setText(count[0] + "개");
					count[index]++;
					f.setTitle("짬뽕: " + count[1] + "개, 우동: " + count[2] + "개, 짜장: " + count[3] + "개");
					int total = 0;
					for (int j = 1; j < count.length; j++) {
						total = total + (count[j] * PRICE[j]);
					}
					labels[2].setText("결제금액: " + total + "원");
					if (count[0] >= 5) { // 5그릇 단위로 1000원 할
						int discount = (count[0] / 5) * PRICE[0];
						total = total - discount;
						labels[2].setText(discount + "원 할인 =>  " + "결제금액: " + total + "원");
					}
				}
			});
		}

		f.add(labels[0]);
		f.add(number);
		f.add(labels[1]);
		f.add(labels[2]);

		f.setVisible(true);
	}

}