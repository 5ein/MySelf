package self;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기JOP {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 500);
		f.getContentPane().setBackground(Color.gray);
		f.setLayout(new FlowLayout());
		
		Font font1 = new Font("나눔스퀘어", Font.BOLD, 30);
		Font font2 = new Font("나눔스퀘어", Font.BOLD, 25);
		Font font = new Font("나눔스퀘어", Font.BOLD, 20);
		
		ImageIcon icon = new ImageIcon("계산기.png");
		
		JLabel label = new JLabel("계산기");
		
		JLabel img = new JLabel();
		img.setIcon(icon);
		
		JLabel first = new JLabel();
		first.setText("숫자1");
		JTextField first1 = new JTextField(10);
		JLabel second = new JLabel();
		second.setText("숫자2");
		JTextField second1 = new JTextField(10);
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String first11 = first1.getText();
				String second11 = second1.getText();
				
				Double First = Double.parseDouble(first11);
				Double Second = Double.parseDouble(second11);
				
				Double result = First + Second;
				
				JOptionPane.showMessageDialog(f, "합은 " + result +" 입니다.");
				first1.setText("");
				second1.setText("");
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String first11 = first1.getText();
				String second11 = second1.getText();
				
				Double First = Double.parseDouble(first11);
				Double Second = Double.parseDouble(second11);
				
				Double result = First - Second;
				
				JOptionPane.showMessageDialog(f, "차는 " + result +" 입니다.");
				first1.setText("");
				second1.setText("");
			}
		});
		
		mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String first11 = first1.getText();
				String second11 = second1.getText();
				
				Double First = Double.parseDouble(first11);
				Double Second = Double.parseDouble(second11);
				
				Double result = First * Second;
				
				JOptionPane.showMessageDialog(f, "곱은 " + result +" 입니다.");
				first1.setText("");
				second1.setText("");
			}
		});
		
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String first11 = first1.getText();
				String second11 = second1.getText();
				
				Double First = Double.parseDouble(first11);
				Double Second = Double.parseDouble(second11);
				
				Double result = First / Second;
				
				JOptionPane.showMessageDialog(f, "나누기는 " + result +" 입니다.");
				first1.setText("");
				second1.setText("");
			}
		});
		
		label.setFont(font1);
		first.setFont(font2);
		first1.setFont(font2);
		second.setFont(font2);
		second1.setFont(font2);
		plus.setFont(font);
		minus.setFont(font);
		mul.setFont(font);
		div.setFont(font);
		
		f.add(label);
		f.add(img);
		f.add(first);
		f.add(first1);
		f.add(second);
		f.add(second1);
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);
		
		f.setVisible(true);
	}

}
