package 복습;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class dog extends Thread{
	int x, y;
	JLabel label;
	public dog(String img, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(img);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
		//add(label);
	}
	
	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int move = r.nextInt(50)+1; //0~49
			x = x + move;
			label.setBounds(x, y, 100, 100);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
}
