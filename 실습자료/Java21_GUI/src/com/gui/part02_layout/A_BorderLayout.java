package com.gui.part02_layout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {

	public A_BorderLayout() {
		
		super("BorderLayout");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(300,200,600,400);
		
		//Layout 설정
//		this.setLayout(new BorderLayout());
		//레이아웃을 설정하지 않아도 기본값이 BorderLayout 이다.
//		System.out.println(this.getLayout()); //설정되는지 확인용.
		
//		JButton north = new JButton("북");
//		JButton south = new JButton("남");
//		JButton east = new JButton("동");
//		JButton west = new JButton("서");
//		JButton center = new JButton("가운데");
		
		//레이아웃의 위치별로 컴포넌트 배치
//		this.add(north,"North");
//		this.add(south,"South");
//		this.add(east,"East");
//		this.add(west,"West");
//		this.add(center,"Center");
		
		//한번에 버튼 생성
//		this.add(new JButton("북"),"North");
//		this.add(new JButton("남"),"South");
//		this.add(new JButton("동"),"East");
//		this.add(new JButton("서"),"West");
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
}
