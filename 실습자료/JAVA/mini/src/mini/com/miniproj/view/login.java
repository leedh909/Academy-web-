package mini.com.miniproj.view;

import javax.swing.*;
import java.awt.*;

public class login {

	public static void main(String[] args) {
	
		JFrame mf = new JFrame("관리자 로그인 화면");
		mf.setLayout(new BorderLayout());
		
		
		Image icon = new ImageIcon("image/약국이미지.PNG").getImage().getScaledInstance(400, 300, 0);
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel(new ImageIcon(icon));
		label1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(label1);
	
		
		JPanel panel2 = new JPanel(new GridLayout(4,2));
		JLabel label2 = new JLabel("  ");
		JLabel label3 = new JLabel("            ID :");
		label3.setFont(new Font("맑은 고딕",Font.BOLD,13));
		label3.setFont(label3.getFont().deriveFont(20.0f));
		label3.setHorizontalAlignment(JLabel.CENTER);
		JTextField text1 = new JTextField(10);
		JLabel label4 = new JLabel("  Password :");
		label4.setFont(new Font("맑은 고딕",Font.BOLD,13));
		label4.setFont(label3.getFont().deriveFont(20.0f));
		label4.setHorizontalAlignment(JLabel.CENTER);
		JPasswordField text2 = new JPasswordField(10);
		
		
		panel2.add(new JLabel(" "));
		panel2.add(new JLabel(" "));
		panel2.add(label3);
		panel2.add(text1);
		panel2.add(label4);
		panel2.add(text2);
		panel2.add(new JLabel(" "));
		panel2.add(new JLabel(" "));
		
		
		
		JPanel panel3 = new JPanel(new FlowLayout());
		JButton button1 = new JButton("이전으로");
		JButton button2 = new JButton("로그인");
		panel3.add(button1);
		panel3.add(new Label("                "));
		panel3.add(button2);
		
		
		mf.add(panel1,"North");
		mf.add(panel2,"Center");
		mf.add(panel3,"South");
		
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
}
