package com.gui.part03_component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class C_RadioButton {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("라디오버튼 테스트");
		mf.setSize(300,150);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		
		topPanel.add(label);
		mf.add(topPanel,"North");
		
		JPanel sizePanel = new JPanel();
		JRadioButton small = new JRadioButton("Small size");
		JRadioButton medium = new JRadioButton("medium size");
		JRadioButton large = new JRadioButton("large size");
		
		
		//라디오 버튼을 버튼그룹으로 지정
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);		
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		mf.add(sizePanel,"Center");
		
		
		JPanel resPanel = new JPanel();
		JLabel text = new JLabel("크기를 선택하지 않았습니다.");
		resPanel.add(text);
		
		
		
		small.addActionListener(new ActionListener() { //Small 사이즈를 선택했을때 텍스트가 바뀐다.
			
			@Override
			public void actionPerformed(ActionEvent e) {

				text.setText("Small size 선택!!");
				
				
			}
		});
		medium.addActionListener(new ActionListener() { //medium 사이즈를 선택했을때 텍스트가 바뀐다.
			
			@Override
			public void actionPerformed(ActionEvent e) {

				text.setText("Medium size 선택!!");
				
				
			}
		});
		large.addActionListener(new ActionListener() { //large 사이즈를 선택했을때 텍스트가 바뀐다.
		
		@Override
		public void actionPerformed(ActionEvent e) {
	
			text.setText("Large size 선택!!");
		
		
			}
		});
		
		mf.add(resPanel,"South"	);
		
		
		
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		
		
		
	}
	
	
}
