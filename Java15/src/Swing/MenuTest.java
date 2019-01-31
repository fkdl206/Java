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
		setTitle("메뉴메뉴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);
		
		this.setLayout(new FlowLayout());
		
		lbl = new JLabel("이글자가 바뀝니다");
		menuBar = new JMenuBar();
		fileMenu = new JMenu("열기");
		editMenu = new JMenu("편집");
		
		newItem = new JMenuItem("새 문서");
		openItem = new JMenuItem("열기");
		closeItem = new JMenuItem("닫기");
		
		new1 = new JMenuItem("하하");
		new2 = new JMenuItem("호호");
		new3 = new JMenuItem("히히");
		
		
		setJMenuBar(menuBar);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();//줄이 생김
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
