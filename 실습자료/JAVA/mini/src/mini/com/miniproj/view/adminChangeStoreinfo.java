package mini.com.miniproj.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class adminChangeStoreinfo {

	public static void main(String[] args) {

		JFrame mf = new JFrame("admin Change Storeinfo");
		mf.setLayout(new BorderLayout());
		mf.setSize(500, 500);
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("하나 약국 프로필");
		panel1.add(label1);
		
		
		JPanel panel5 = new JPanel(new GridLayout(2,1));
		JPanel panel2 = new JPanel(new GridLayout(0,2));
		JLabel label2 = new JLabel("1. 주소: ");
		JTextField text1 = new JTextField(10);
		JLabel label3 = new JLabel("2. 전화번호:");
		JTextField text2 = new JTextField(10);
		JLabel label4 = new JLabel("3. 마스크 현황");
		
		panel2.add(label2);
		panel2.add(text1);
		panel2.add(label3);
		panel2.add(text2);
		panel2.add(label4);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3,2));
		JLabel label5 = new JLabel(" KF94 : ");
		JTextField text3 = new JTextField(10);
		JLabel label6 = new JLabel(" KF80 : ");
		JTextField text4 = new JTextField(10);
		JLabel label7 = new JLabel(" 일반마스크 : ");
		JTextField text5 = new JTextField(10);
		panel3.add(label5);
		panel3.add(text3);
		panel3.add(label6);
		panel3.add(text4);
		panel3.add(label7);
		panel3.add(text5);
		
		panel5.add(panel2);
		panel5.add(panel3);
		
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton button1 = new JButton("수정");
		panel4.add(button1);
		
		
		mf.add(panel1,"North");
		mf.add(panel5,"Center");
		mf.add(panel4,"South");
		
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
	}

}
