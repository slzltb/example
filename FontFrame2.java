package sist.com.io1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
//글꼴 글꼴스타일 크기
public class FontFrame2 extends JFrame{
	JList<String>list;
	JList<String>list2;
	JList<Integer>list3;
	String[]i= {"맑은 고딕","바탕","바탕체","새굴림","한컴 고딕","한컴산뜻돋움","함초롬돋움","함초롬돋움 확장"};
	String[]j= {"가늘게","보통","굵게","가는 기울임꼴","기울임꼴","굵은 기울임꼴"};
	Integer[]k= {10,11,12,13,14,15,16,17,18,19,20};
	JTextField tf,tf2,tf3,tfvalue;
	
	public void inintFrame1() {
		list = new JList<>(i);
		list2 = new JList<>(j);
		list3 = new JList<>(k);
		
		Dimension dim= new Dimension(400,400);
		
		JFrame frame = new JFrame();
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(new JLabel("글꼴"));
		panel1.add(tf=new JTextField());
		//tfvalue.setText(String.valueOf(i[list.getSelectedIndex()]));
		panel1.add("West",new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(new JLabel("글꼴 스타일"));
		panel2.add(tf2=new JTextField());
		panel2.add("West",new JScrollPane(list2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		
		
		JPanel panel3=new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(new JLabel("크기"));
		panel3.add(tf3=new JTextField());
		panel3.add("West",new JScrollPane(list3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		
		JPanel panel4=new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		JPanel panel5=new JPanel();
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
		panel5.add(new JButton("Aplly"));
		JPanel panel6=new JPanel();
		panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
		panel6.add(new JButton("Cancel"));
		
		JPanel panel7=new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		panel4.add(panel5);
		panel4.add(panel6);
		
		
		frame.add(panel4,BorderLayout.NORTH);
		frame.add(panel7,BorderLayout.LINE_END);
		frame.pack();
		frame.setVisible(true);
		
				
		}
	public FontFrame2() {
		inintFrame1();
		list.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseClicked(e);
				//System.out.println(i[list.getSelectedIndex()]);
				tf.setText(String.valueOf(i[list.getSelectedIndex()]));
				/*
				System.out.println(k[list.getSelectedIndex()]);
				tf3.setText(String.valueOf(k[list.getSelectedIndex()]));*/
			}
			
		});
		
		
		/*this.setBounds(100,100,500,500);
		this.setVisible(true);*/
	}
	
	public static void main(String[] args) {
		FontFrame2 f = new FontFrame2(); 
		
	}
	

}
