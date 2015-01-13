package com.johir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Swing2 implements ActionListener {
	JFrame f;
	private JButton btn1;
	private JRadioButton rb1,rb2;
	
	
	public Swing2() {
		// TODO Auto-generated constructor stub
		f=new JFrame();
		rb1=new JRadioButton("Male");
		rb1.setBounds(100,50,100,30);  
		rb2=new JRadioButton("Female");
		rb2.setBounds(100,100,100,30);  
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		btn1=new JButton("Click");
		btn1.setBounds(100, 150, 80, 30);
		btn1.addActionListener(this);
		f.add(rb1);
		f.add(rb2);
		f.add(btn1);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(rb1.isSelected()){
			JOptionPane.showMessageDialog(null, "You are Male");
		}
		if(rb2.isSelected()){
			JOptionPane.showMessageDialog(null, "You are Female");
		}
		
	}

}
