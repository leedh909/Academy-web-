package mini.com.miniproj.view;

import javax.swing.*;

import java.awt.*;

public class ModeChoose {

	
	public static void main(String[] args) {
		
		JFrame mf = new JFrame("원하는 모드를 선택해주세요");
		mf.setLayout(new BorderLayout());
		mf.setBounds(650, 300, 1200, 500);
		
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("***공적마스크 예약시스템에 오신걸 환영합니다***");
		label1.setFont(new Font("맑은 고딕",Font.BOLD, 11));
		label1.setFont(label1.getFont().deriveFont(50.0f));
		label1.setForeground(Color.WHITE);
		panel1.setBackground(new Color(82, 204, 250));
		panel1.add(label1);

		
		JPanel panel2 = new JPanel(new GridLayout(1,2));
		JButton button1 = new JButton("고객 모드");
		button1.setFont(new Font("맑은 고딕",Font.BOLD, 11));
		button1.setFont(button1.getFont().deriveFont(30.0f));
		JButton button2 = new JButton("관리자 모드");
		button2.setFont(new Font("맑은 고딕",Font.BOLD, 11));
		button2.setFont(button2.getFont().deriveFont(30.0f));
		JLabel label2 = new JLabel(" ");
		
		panel2.add(button1);
		panel2.add(button2);
		
		mf.add(panel1,"North");
		mf.add(panel2,"Center");
	
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
}
