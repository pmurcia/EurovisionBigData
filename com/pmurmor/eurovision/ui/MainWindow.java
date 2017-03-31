package com.pmurmor.eurovision.ui;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	public static void main(String[] args)
	{
		new MainWindow();
	}
	
	public MainWindow()
	{
		super("ME ME BIG BOY");
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("Working?"));
		this.add(new JTextField("",100));
		this.add(new JButton("Submit"));
		
		this.pack();
		this.setVisible(true);
	}
}
