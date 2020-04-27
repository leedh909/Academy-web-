package com.gui.part02_layout;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{

	public C_GridLayout() {
		
		super("GridLayout");
		
		this.setBounds(300, 200, 600, 400);
		
		
		//GridLayout
		//가로, 세로, 가로갭, 세로갭 순으로 값을 넣는다.
//		this.setLayout(new GridLayout(5,5,10,20));
		this.setLayout(new GridLayout(5,5));
		
//		for(int i = 1;i<=26;i++) {
//			String str = new Integer(i).toString();
//			this.add(new JButton(str));
//			
//		}
		
		
		//set을 이용해 중복 제거하여 랜덤으로 빙고판 만들기
		
		//강사님 코딩
//		Set set = new LinkedHashSet();
//		
//		while(set.size()<25){
//			set.add(new Random().nextInt(25)+1);
//		}
//		System.out.println(set);
//		
//		Object[] obj  = set.toArray();
//		
//		for(int i=0; i<obj.length;i++) {
//			String str = new Integer((int)obj[i]).toString();
//			this.add(new JButton(str));
//		}
		
		
		//내코딩
		Set set = new HashSet();    //HashSet을 호출시 어느정도까지는 정렬이 된 상태로 나온다. 그래서 LinkedHashSet()을 사용해서 순서를 있게 만들어서 불러온다.
		while(set.size()<25){

			set.add((int)(Math.random()*25+1));
			
		}
		System.out.println();
		System.out.println(set);
		
		Iterator setit = set.iterator();
		
		while(setit.hasNext()) {
			this.add(new JButton(setit.next().toString()));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	
	
	
	
	
}
