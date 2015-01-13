package com.johir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Swing1 extends JFrame implements ActionListener{
	private JButton btn1;
	private JRadioButton rb1,rb2;
	public Swing1() {
		// TODO Auto-generated constructor stub
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
		add(rb1);
		add(rb2);
		add(btn1);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing1();

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
