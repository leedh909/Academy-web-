package ncs.test7;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame1 extends JFrame{

	
	public ScoreFrame1() {
		
		this.setBounds(650, 200, 400, 300);
		this.setLayout(new GridLayout(4,1));
		
		StringBuilder sb = new StringBuilder();
		
		int num = (this.getBounds().width)/10  - 15 ;
		System.out.println(num);
		for(int i=0; i<num;i++) {
			sb.append(" ");
		}
		
		
		
		this.setTitle(sb+"문제7");
		
		this.setResizable(false);
		
		
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("점수를 입력하세요");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setFont(new Font("굴림", Font.BOLD, 15));
		label1.setFont(label1.getFont().deriveFont(40.0f));
		panel1.add(label1);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label2 = new JLabel("자바 : ");
		JTextField javaScore = new JTextField(10);
		JLabel label3 = new JLabel("SQL : ");
		JTextField sqlScore = new JTextField(10);
		panel2.add(label2);
		panel2.add(javaScore);
		panel2.add(new JLabel("        "));
		panel2.add(label3);
		panel2.add(sqlScore);
		
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton calcBtn = new JButton("계산하기");
		
		panel3.add(calcBtn);
		
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label4 = new JLabel("총점 : ");
		JTextField total = new JTextField(10);
		JLabel label5 = new JLabel("평균 : ");	
		JTextField average = new JTextField(10);
		panel4.add(label4);
		panel4.add(total);
		panel4.add(new JLabel("        "));
		panel4.add(label5);
		panel4.add(average);
		
		
		calcBtn.addActionListener(new ScoreFrame$ActionHandler(calcBtn, javaScore,sqlScore,total, average));
		

		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
}
