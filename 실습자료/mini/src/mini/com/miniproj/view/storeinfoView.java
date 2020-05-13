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

import mini.com.miniproj.controller.MainController;
import mini.com.miniproj.model.Maskinfo;

public class storeinfoView extends JPanel {

	public storeinfoView(MainController mc, int indexnum) {
		
		Font f1 = new Font("궁서",Font.BOLD,50);
		Font f2 = new Font("돋음",Font.BOLD,30);
		Font f3 = new Font("돋음",Font.BOLD,30);
		
//		JFrame mf = new JFrame("해당 약국의 마스크 정보");
		
		this.setLayout(new BorderLayout());
		
		//north
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.blue);
		JLabel label1 = new JLabel(mc.getStoreList().get(indexnum).getStoreName().toString()+"의 약국 프로필");
		label1.setForeground(Color.WHITE);
		label1.setFont(f1);
		panel1.add(label1);
		
		
		//center
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setLayout(new GridLayout(2,1));
		JLabel label2 = new JLabel("		● "+mc.getStoreList().get(indexnum).getAddress().toString());
		JLabel label3 = new JLabel("		● "+mc.getStoreList().get(indexnum).getPhoneNumber().toString());
		label2.setFont(f2);
		label3.setFont(f2);
		label2.setHorizontalAlignment(JLabel.LEFT);
		label3.setHorizontalAlignment(JLabel.LEFT);
		panel2.add(label2);
		panel2.add(label3);
		
		
		
		//south
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.getHSBColor(100, 100, 100));
		panel3.setLayout(new GridLayout(3,2));
		JLabel label4 = new JLabel(" ● KF94			");
		JLabel label5 = new JLabel(" "+((Maskinfo)mc.getStoreList().get(indexnum).getMaskinfo().get(0)).getMaskNum()+"개");
		JLabel label6 = new JLabel(" ● KF80		");
		JLabel label7 = new JLabel(" "+((Maskinfo)mc.getStoreList().get(indexnum).getMaskinfo().get(1)).getMaskNum()+"개");
		JLabel label8 = new JLabel(" ● 일반마스크		");
		JLabel label9 = new JLabel(" "+((Maskinfo)mc.getStoreList().get(indexnum).getMaskinfo().get(2)).getMaskNum()+"개");
		label4.setFont(f3);
		label5.setFont(f3);
		label6.setFont(f3);
		label7.setFont(f3);
		label8.setFont(f3);
		label9.setFont(f3);
		panel3.add(label4);
		panel3.add(label5);
		panel3.add(label6);
		panel3.add(label7);
		panel3.add(label8);
		panel3.add(label9);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		panel4.add(panel1,"North");
		panel4.add(panel2,"Center");
		panel4.add(panel3,"South");
		
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton button = new JButton("예약진행");
		panel5.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new mini.com.miniproj.view.MainView().replace(new userinfoView());
				
				
			}
		});
		
		
		
		
		this.add(panel4,"Center");
		this.add(panel5,"South");
		
		
	}
	
	
	
}
