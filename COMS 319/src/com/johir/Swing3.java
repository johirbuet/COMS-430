package com.johir;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Swing3 extends JFrame implements ActionListener{
	
	public Swing3() {
		// TODO Auto-generated constructor stub
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);  
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		JPanel panel=new JPanel();  
		panel.add(slider);		  
		add(slider);  
	}
	
	public static void main(String[] args) {
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Swing3 obj=new Swing3();
		obj.pack();
		
		int x=(int) ((dim.getWidth()-obj.getWidth())/2);
		int y=(int) ((dim.getHeight()-obj.getHeight())/2);
		Point p=new Point();
		p.x=x;
		p.y=y;
		obj.setLocation(p);
		obj.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
