package ncs.test7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ScoreFrame$ActionHandler implements ActionListener{

	private JButton button;
	private JTextField total;
	private JTextField average;
	private JTextField javaScore;
	private JTextField sqlScore;
	
	
	public ScoreFrame$ActionHandler() {}


	public ScoreFrame$ActionHandler(JButton button, JTextField javaScore,
			JTextField sqlScore,JTextField total, JTextField average) {
		button.addActionListener(this);
		this.button = button;
		this.total = total;
		this.average = average;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		int tot = Integer.parseInt(javaScore.getText())+Integer.parseInt(sqlScore.getText());
		total.setText(String.valueOf(tot));
		int avg = tot/2;
		average.setText(String.valueOf(avg));
		
	}
	
	
	
}
