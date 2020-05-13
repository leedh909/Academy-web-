package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClass extends JFrame{

	
	private JButton button;
	private JLabel label;
	
	
	public B_OtherClass() {
	
		this.setSize(200, 200);
		this.setTitle("OtherClass");
	
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이...");
		
		button.addActionListener(new MyEvent(button,label));
		
		
		panel.add(button);
		panel.add(label);
		
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	
}

class MyEvent implements ActionListener{

	private JButton button;
	private JLabel label;
	
	//생성자(기본,매개변수)
	public MyEvent() {}
	public MyEvent(JButton button, JLabel label) {
		button.addActionListener(this);  //내가(=MyEvent) 처리하겠다.라는 의미이다.
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		label.setText("드디어 버튼이....");
		
	}

}