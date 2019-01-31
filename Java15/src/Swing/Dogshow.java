package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dogshow extends JFrame implements ActionListener {

	JLabel lable = null;
	
	public Dogshow() {
		setTitle("댕댕이가 보여요..ㅋㅋ ");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		lable = new JLabel("이미지를 보려면 아래 버튼을 클릭 고고");
		JButton btn = new JButton("강아지 이미지 클릭");
		ImageIcon icon = new ImageIcon("icon.png");
		btn.setIcon(icon);
		btn.addActionListener(this);
		
		panel.add(lable);	// 일단 패널에다 다 올리기
		panel.add(btn);
		
		add(panel);			// 패널을 컴포넌트에 올리기
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ImageIcon dog = new ImageIcon("dog.jpg");
		lable.setIcon(dog);
		lable.setText(null);
	}

	public static void main(String[] args) {
		
		new Dogshow();
	}
}
