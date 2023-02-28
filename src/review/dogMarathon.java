package review;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class dogMarathon extends JFrame{
	
	public static void main(String[] args) {
		dogMarathon f = new dogMarathon();
	}
	
	public dogMarathon() {
		setTitle("강아지 경주");
		setSize(700, 700);
		setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		dog dog1 = new dog("강아지1.jpg", 100, 0);
		dog dog2 = new dog("강아지2.jpg", 100, 150);
		dog dog3 = new dog("강아지3.jpg", 100, 300);
		
		dog1.start();
		dog2.start();
		dog3.start();
		
		setVisible(true);
	}
	
	public class dog extends Thread{
		int x, y;
		JLabel label;
		
		public dog(String img, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(img);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 300, 300);
			add(label);
		}
		
		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 100; i++) {
				int move = r.nextInt(50)+1; //0~49
				x = x + move;
				label.setBounds(x, y, 300, 300);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}
	}
}
