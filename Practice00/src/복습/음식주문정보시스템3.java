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

public class 음식주문정보시스템3 {
	//혼자 복습함!
	
	static int count;
	static int count1;
	static int count2;
	static int count3;
	
	final static int PRICE1 = 6000;//짬뽕
	final static int PRICE2 = 5000;//우
	final static int PRICE3 = 5500;//짜장
	
	static  String[] food = {"짬뽕", "우동","짜장"};
	static  String[] foodImg = {"111.png", "222.png","333.png"};
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("중국집 주문 키오스크");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.black);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("12롯데마트드림Medium", 1, 20);
		
		for (int i = 0; i < food.length; i++) {
			
		}
		
		JButton b1 = new JButton(food[0]);
		JButton b2 = new JButton(food[1]);
		JButton b3 = new JButton(food[2]);
		JButton b4 = new JButton("0개");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b1.setBackground(Color.DARK_GRAY);
		b2.setBackground(Color.DARK_GRAY);
		b3.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.white);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		b4.setBackground(Color.gray);
		
		JLabel l1 = new JLabel("개수: ");
		l1.setFont(font);
		l1.setForeground(Color.white);
		
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		img.setIcon(icon);
		
		JLabel result = new JLabel("총 결제금액 : 0원");
		result.setFont(font);
		result.setForeground(Color.white);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(foodImg[0]);
				img.setIcon(icon);
				count++;
				b4.setText(count + "개");
				count1++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 +"개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("총 결제금액: " + total + "원");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(foodImg[1]);
				img.setIcon(icon);
				count++;
				b4.setText(count + "개");
				count2++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 +"개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("총 결제금액: " + total + "원");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(foodImg[2]);
				img.setIcon(icon);
				count++;
				b4.setText(count + "개");
				count3++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 +"개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("총 결제금액: " + total + "원");
			}
		});
				
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(b4);
		f.add(img);
		f.add(result);
		
	
		
		f.setVisible(true);
	
	}

}
