package com.gui.part03_component;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class F_ComboBox {
	public static void main(String[] args) {
	
		JFrame mf = new JFrame();
		mf.setSize(300,200);
		
		
		String[] animals = {"dog","cat","tiger"};
		
		//콤보박스 생성
		JComboBox animalList = new JComboBox(animals);
		
		animalList.setSelectedIndex(1);
		
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//어떤 메뉴를 선택했는지에 대한 요소를 가지고 온다.
				JComboBox cb = (JComboBox)e.getSource();  //getSource() 메소드는 처음에 Object타입으로 가져온다. 그러니깐 형변환 필수!!!!!
				
				//선택된 메뉴의 텍스트를 가지고 온다.
				String name =  (String)cb.getSelectedItem();
				
				//선택된 이름에 해당하는 사진을 label에 추가
				Image img = new ImageIcon("images/"+name+".PNG").getImage().getScaledInstance(200, 200, 0);
				label.setIcon(new ImageIcon(img));
				

			}
		});
		
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		mf.add(animalList,"North");
		mf.add(label,"Center");
		
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}
}
