package com.event.part01_mouseAndKey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseEvent extends	JFrame implements MouseListener, MouseMotionListener{
	
	public MouseEvent() {
	
		this.setTitle("Mouse Event");
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		
		
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		
		new MouseEvent();

		
	}
	
	public void display(String s,java.awt.event.MouseEvent e) {
		System.out.println(s+" x= "+e.getX()+", y= "+e.getY());
	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {

		this.display("Mouse dragged", e);
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		this.display("Mouse moved", e);
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) { //마우스를 클릭하고 때는 순간 입력된다.
		this.display("Mouse Clicked(clicks: "+e.getClickCount()+")", e);		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) { //마우스를 누르는 순간 입력된다.
		this.display("Mouse pressed", e);
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) { //마우스 클릭을 때는 순간 입력된다.
		this.display("Mouse Released", e);		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) { //프레임에 들어가는 순간 입력된다.
		this.display("Mouse entered", e);		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) { //프레임에서 나오는 순간 입력된다.
		this.display("Mouse exited", e);		
	}
}
