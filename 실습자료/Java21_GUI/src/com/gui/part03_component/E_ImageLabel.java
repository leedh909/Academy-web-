package com.gui.part03_component;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class E_ImageLabel {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("이미지 라벨 테스트");
		mf.setSize(300, 350);
		
		JPanel panel = new JPanel();
		
		//이미지 객체를 생성(크기 지정)
		//ImageIcon으로 이미지 사이즈를 변경한뒤 다시 ImageIcon으로 추가한다.
		Image icon = new ImageIcon("images/user.PNG").getImage().getScaledInstance(200, 200, 0);
		
		JLabel label = new JLabel(new ImageIcon(icon));
		
		JButton button = new JButton("이미지 보기");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				Image icon = new ImageIcon("images/dog.PNG").getImage().getScaledInstance(200, 200, 0);
				label.setIcon(new ImageIcon(icon));
		
			}
		});
		
		
		
		
		panel.add(label,"Center");
		panel.add(button,"South");
		mf.add(panel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
		
		
	}
	
	
	
}
