package mini.com.miniproj.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class reserveinfo {

	
	public static void main(String[] args) {
		
		
		JFrame mf = new JFrame();
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("**** 예약 내역 ****");
		label1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(label1);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,3,50,15));
		JLabel label2 = new JLabel(" ● KF94			");
		JLabel label3 = new JLabel("수량 : ");
		JLabel label4 = new JLabel("개");
		JLabel label5 = new JLabel(" ● KF80		");
		JLabel label6 = new JLabel("수량 : ");
		JLabel label7 = new JLabel("개");
		JLabel label8 = new JLabel(" ● 일반마스크		");
		JLabel label9 = new JLabel("수량 : ");
		JLabel label10 = new JLabel("개");
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(label5);
		panel2.add(label6);
		panel2.add(label7);
		panel2.add(label8);
		panel2.add(label9);
		panel2.add(label10);
		
		
	
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel label11 = new JLabel("노랑약국의 예약 완료!");
		panel3.add(label11);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton button = new JButton("확인");
		panel4.add(button);
		
		
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BorderLayout());
		JLabel label12 = new JLabel("  ");
		panel5.add(label12,"North");
		panel5.add(panel3,"Center");
		panel5.add(panel4,"South");
	
		
		
		mf.add(panel1,"North");
		mf.add(panel2,"Center");
		mf.add(panel5,"South");
		
		
		
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}
