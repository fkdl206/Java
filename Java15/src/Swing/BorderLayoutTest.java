package Swing;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {

	public BorderLayoutTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Border Layout ¿¬½À ¤¡ ¤¡");
		setSize(256, 256);
		this.setLayout(new BorderLayout(10,10));
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		
		this.add(btn1, BorderLayout.NORTH);
		this.add(btn2, BorderLayout.WEST);
		this.add(btn3, BorderLayout.CENTER);
		this.add(btn4, BorderLayout.EAST);
		this.add(btn5, BorderLayout.SOUTH);
		
		
	}
	public static void main(String[] args) {
	new BorderLayoutTest();	
	}
}
