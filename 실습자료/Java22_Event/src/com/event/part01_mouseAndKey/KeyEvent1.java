package com.event.part01_mouseAndKey;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEvent1 extends JFrame implements KeyListener{

	
	public KeyEvent1() {
	
		this.setTitle("Key event");
		this.setSize(300,300);
		JTextField tf = new JTextField(30);
		
		tf.addKeyListener(this);
		
		
		
		this.add(tf);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
			
	public static void main(String[] args) {

		new KeyEvent1();
		
	}
	public void display(String s , KeyEvent e) {
		
		//알트 컨트롤 쉬프트    //눌렸을때 (TRUE)값이 들어간다.
		String str = e.isAltDown()+" : "+e.isControlDown()+" : "+e.isShiftDown();
		
		System.out.println(s+" "+e.getKeyChar()+" "+str);
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		this.display("keyTyped",e);
	}



	@Override
	public void keyPressed(KeyEvent e) {
		this.display("keyPressed", e);
	}



	@Override
	public void keyReleased(KeyEvent e) {
		this.display("keyReleased", e);
	}

}
