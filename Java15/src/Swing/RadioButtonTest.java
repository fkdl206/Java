package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest extends JFrame implements ActionListener {
	private JRadioButton small, medium, large;
	private JLabel text, result;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public RadioButtonTest() {
		setTitle("라디오 버튼 테스트");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		text = new JLabel("어떤크기의 커피를 주문하시겠습니까?");
		topPanel.add(text);
		
		sizePanel = new JPanel();
		small = new JRadioButton("small size");
		medium = new JRadioButton("medium size");
		large = new JRadioButton("large size");
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);		
		
		resultPanel = new JPanel();
		result = new JLabel("크기가 아직 선택이 되지 않았습니다");
		resultPanel.add(result);
		
		//사이즈
		add(topPanel, BorderLayout.NORTH);
		add(sizePanel, BorderLayout.CENTER);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == small) {				// ActionEcent arg0 값임
			result.setText("Small choice!");
		}
		if(arg0.getSource() == medium) {				// ActionEcent arg0 값임
			result.setText("medium choice!");
		}
		if(arg0.getSource() == large) {				// ActionEcent arg0 값임
			result.setText("large choice!");
		}
		
	}

	public static void main(String[] args) {
		new RadioButtonTest();
	}
}
