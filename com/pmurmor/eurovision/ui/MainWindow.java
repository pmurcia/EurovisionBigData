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
		
		// MENU BAR
		JMenuBar mb = new JMenuBar();
		JMenu fileTab = new JMenu("File");
		fileTab.add(new JMenuItem("Open..."));
		fileTab.add(new JMenuItem("Save..."));
		fileTab.addSeparator();
		fileTab.add(new JCheckBoxMenuItem("Save As"));
		mb.add(fileTab);
		this.setJMenuBar(mb);
		
		// LAYOUT
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		
		// WEST ZONE (OPTION PANEL)
		this.add(new JScrollPane(), BorderLayout.WEST);
		
		// CENTER ZONE (INFO PANEL)
		this.add(new JScrollPane(), BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
	}
}
