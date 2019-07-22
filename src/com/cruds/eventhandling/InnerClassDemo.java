package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InnerClassDemo extends Applet{

	@Override
	public void init() {
		addMouseListener(new MyMouseListener2());
	}
	
	class MyMouseListener2 extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e) {
			showStatus("Mouse Clicked");
		}
	}
	
}
