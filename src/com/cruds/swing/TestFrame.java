package com.cruds.swing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestFrame extends Frame {
	
	TestFrame()
	{
		setTitle("Demo");
		setSize(300, 300);
		setLocation(400, 300);
	}

	public static void main(String[] args) {
		Frame f = new TestFrame();
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	}
	
}
