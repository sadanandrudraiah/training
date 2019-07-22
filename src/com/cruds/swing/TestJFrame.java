package com.cruds.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestJFrame extends JFrame {
	
	private JButton btnClose;
	private JButton btnPing;
	private JPanel panel;

	public TestJFrame() {
		setTitle("Swing Demo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnPing = new JButton("Ping");
		btnPing.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getToolkit().beep();
			}
		});
		
		panel.add(btnClose); // adding button to Panel
		panel.add(btnPing); // adding button to Panel
		add(panel); // Flow Layout
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestJFrame();
	}
	
	
}
