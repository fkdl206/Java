package Swing;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest  extends JFrame {
	
	public FlowLayoutTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Flow Layout 연습");
		this.setLayout(new FlowLayout());

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		setSize(256, 256);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
