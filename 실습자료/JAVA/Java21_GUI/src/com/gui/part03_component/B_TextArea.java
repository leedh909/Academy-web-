package com.gui.part03_component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class B_TextArea {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		//입력용 텍스트 필드
		JTextField tf = new JTextField(30);
		
		//출력용 텍스트 필드
		JTextArea ta = new JTextArea(10,30);
		
		//엔터를 입력하면 액션 리스너 실행
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text+"\n");
				tf.setText("");   //실행을 했을때 텍스트 창을 비운다.(=다른내용으로 채운다)
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		mf.add(tf,"North");
		mf.add(ta,"Center");
		
		
		
		//컨테이너크기를 구성요소들의 크기로 설정
		mf.pack();
		
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
