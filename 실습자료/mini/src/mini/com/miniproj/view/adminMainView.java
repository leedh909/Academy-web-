package mini.com.miniproj.view;

import javax.swing.*;
import java.awt.*;

public class adminMainView {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("admin Main View");
		mf.setLayout(new GridLayout(4,1));
		mf.setSize(500, 500);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		JLabel label1 = new JLabel("***관리자 페이지에 오신걸 환영합니다.***");
		label1.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(label1,"Center");
		
		
		JButton button1 = new JButton("약국수정");
		JButton button2 = new JButton("구매자 리스트");
		JButton button3 = new JButton("되돌아가기");
		
		
		mf.add(panel1);
		mf.add(button1);
		mf.add(button2);
		mf.add(button3);
		
		
		
		
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
