package ncs.test7;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame2 {

	
	public void ScoreFrame2() {
	
		JFrame frame = new JFrame();
		frame.setTitle("문제7");
		frame.setSize(500, 300);;
		frame.setLayout(new GridLayout(4,1));
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				titleAlign(frame);
			}
		});
		
		
		
		
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
		panel4.add(label5);
		panel4.add(average);
		
		
		calcBtn.addActionListener(new ScoreFrame$ActionHandler(calcBtn, javaScore,sqlScore,total, average));
		

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	private void titleAlign(JFrame frame) {
		Font font = frame.getFont();

       String currentTitle = frame.getTitle().trim();
       FontMetrics fm = frame.getFontMetrics(font);
       int frameWidth = frame.getWidth();
       int titleWidth = fm.stringWidth(currentTitle);
       int spaceWidth = fm.stringWidth(" ");
       int centerPos = (frameWidth / 2) - (titleWidth / 2);
       int spaceCount = centerPos / spaceWidth;
       String pad = "";
       pad = String.format("%" + (spaceCount - 14) + "s", pad);
       frame.setTitle(pad + currentTitle);

	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			new ScoreFrame2().ScoreFrame2();
		});
	}
	
	
	
}
