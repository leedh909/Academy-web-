package com.gui.part03_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame();
		mf.setSize(800, 300);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.setSize(800,300);
		
		//글을 입력할 수 있는 텍스트 상자
		JTextField id = new JTextField(30);
		
		//비밀번호를 입력 할 수 있는 TextField
		//입력되는 값을 화면상에서 볼 수 없다, 한글입력X
		JPasswordField password = new JPasswordField(30);
		
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		panel.add(new JLabel("PW"));
		panel.add(password);
		
		//여러 줄의 텍스트를 입력 할 수 있다.
		JTextArea textArea = new JTextArea(10,30);
		
		textArea.setEditable(false);
	//	panel.add(textArea);  //크기를 벗어나기때문에 이상하게 나온다.
		
		
		//JButton
		JButton btn = new JButton("보내기");
		
		//메인프레임에 추가
		mf.add(panel, BorderLayout.NORTH);
		mf.add(btn, BorderLayout.SOUTH);
		mf.add(textArea,BorderLayout.CENTER);

		//보내기 버튼을 눌렀을 때 이벤트 동작 연결
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String text = "id = "+ id.getText()+"\n";
				text += "pw =" + password.getPassword()+"\n";
				
				textArea.append(text);
				
				
				
			}
		});
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
	}
	
	
	
	
}
