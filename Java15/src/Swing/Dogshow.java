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
		setTitle("����̰� ������..���� ");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		lable = new JLabel("�̹����� ������ �Ʒ� ��ư�� Ŭ�� ���");
		JButton btn = new JButton("������ �̹��� Ŭ��");
		ImageIcon icon = new ImageIcon("icon.png");
		btn.setIcon(icon);
		btn.addActionListener(this);
		
		panel.add(lable);	// �ϴ� �гο��� �� �ø���
		panel.add(btn);
		
		add(panel);			// �г��� ������Ʈ�� �ø���
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
