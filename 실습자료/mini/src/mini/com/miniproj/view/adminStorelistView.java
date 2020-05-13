package mini.com.miniproj.view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class adminStorelistView {

	public static void main(String[] args) {

		
		JFrame mf = new JFrame("admin Storelist View");
		mf.setLayout(new BorderLayout());
		mf.setSize(500, 500);
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("약국 리스트");
		label1.setFont(new Font("맑은 고딕" , Font.PLAIN, 40 ));//글씨체
		label1.setFont(label1.getFont().deriveFont(55.0f));//글씨크기60.0f
		panel1.add(label1);
		
		
		JPanel panel2 = new JPanel();
		String[] pharmacy = {"    빨강 약국","    주황 약국","    노랑 약국","    초록 약국","    파랑 약국","    남색 약국","    보라 약국"};
		JList list = new JList(pharmacy);
		list.setFont(list.getFont().deriveFont(20.0f));
		list.setBorder(BorderFactory.createLineBorder(Color.black,2));
		list.setPreferredSize(new Dimension(100,200));
		list.setBackground(Color.WHITE);
		panel2.add(list);
		
		
		JScrollPane scroller = new JScrollPane(list);
		scroller.setPreferredSize(new Dimension(300,250));		
		panel2.add(scroller);
		

		JLabel label2 = new JLabel(" 선택한 약국: ");
		label2.setFont(new Font("맑은 고딕" , Font.BOLD, 17 ));
		
		JTextField selected = new JTextField(9);
		selected.setEditable(false);
			
		//선택완료 버튼 South
		JPanel panel3 = new JPanel();
		JButton stbutton = new JButton("선택 완료");
		stbutton.setPreferredSize(new Dimension(120,30));
		stbutton.setFont(stbutton.getFont().deriveFont(19.0f));
		panel3.setBackground(Color.WHITE);
				
				
		//약국 선택시 선택한 약국:에 표시 
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				selected.setText((String)list.getSelectedValue());
				selected.setPreferredSize(new Dimension(200,160));
				selected.setFont(new Font("serif" , Font.BOLD, 15));
			}
		});
		
		panel3.add(label2);
		panel3.add(selected);
		panel3.add(stbutton);
		
		
		mf.add(panel1,"North");
		mf.add(panel2,"Center");
		mf.add(panel3,"South");
		
		
		
		
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}

}
