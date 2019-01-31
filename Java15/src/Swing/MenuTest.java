package Swing;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame implements ActionListener {

	JLabel lbl = null;
	JMenuBar menuBar= null;
	JMenu fileMenu;
	JMenu editMenu;
	JMenuItem newItem, openItem, closeItem;
	JMenuItem new1, new2, new3;
	
	public MenuTest() {
		setTitle("�޴��޴�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);
		
		this.setLayout(new FlowLayout());
		
		lbl = new JLabel("�̱��ڰ� �ٲ�ϴ�");
		menuBar = new JMenuBar();
		fileMenu = new JMenu("����");
		editMenu = new JMenu("����");
		
		newItem = new JMenuItem("�� ����");
		openItem = new JMenuItem("����");
		closeItem = new JMenuItem("�ݱ�");
		
		new1 = new JMenuItem("����");
		new2 = new JMenuItem("ȣȣ");
		new3 = new JMenuItem("����");
		
		
		setJMenuBar(menuBar);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();//���� ����
		fileMenu.add(closeItem);
		
		editMenu.add(new1);
		editMenu.add(new2);
		editMenu.addSeparator();
		editMenu.add(new3);
		
		
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

	public static void main(String[] args) {
		new MenuTest();
		

	}

}
