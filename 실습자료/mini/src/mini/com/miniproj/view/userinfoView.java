package mini.com.miniproj.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class userinfoView extends JPanel{
	
	String textstr1,textstr2;
	public userinfoView() {
		
		Font f1 = new Font("궁서",Font.BOLD,50);
		Font f2 = new Font("돋음",Font.BOLD,25);
		Font f3 = new Font("돋음",Font.BOLD,30);
		
		this.setLayout(new BorderLayout());
		
		//메인 프레임의 North 부분
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.blue);
		JLabel label1 = new JLabel("노랑약국의 예약진행");
		label1.setFont(f1);
		label1.setForeground(Color.white);
		panel1.add(label1);
		
		
		//메인 프레임의 Center sub 1
		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel("        이름:  ");
		JTextField text1 = new JTextField(10);
		
		
		label2.setFont(f2);
		panel2.add(label2);
		panel2.add(text1);
		
		//메인 프레임의 Center sub 2
		JPanel panel3 = new JPanel();
		JLabel label3 = new JLabel("주민번호:  ");
		JTextField text2 = new JTextField(10);
		
		text2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textstr = text2.getText();

				if(textstr.length()==6) {
					text2.setText(textstr);
				}else{
					text2.setText("입력방법이 틀립니다.");
				}
			}
		});

		
		label3.setFont(f2);
		panel3.add(label3);
		panel3.add(text2);
		
		
		//메인 프레임의 Center
		//panel4에 panel2, panel3이 들어간다.
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(2,1));
		panel4.add(panel2);
		panel4.add(panel3);
		
				
		//메인 프레임의 South
		JPanel panel5 = new JPanel();
		panel5.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton button = new JButton("  확인  ");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textstr1=text1.getText();
				textstr2=text2.getText();
				System.out.println("이름: "+textstr1+", 주민번호: "+textstr2);
				
				
			}
		});
		
		panel5.add(button);
		
		
		
		
		this.add(panel1,"North");
		this.add(panel4,"Center");
		this.add(panel5,"South");
	
	}
	
	
}
