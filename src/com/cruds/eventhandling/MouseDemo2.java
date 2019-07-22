package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDemo2 extends Applet {
	
	@Override
	public void init() {
		addMouseListener(new MyMouseListener(this));
	}

}

class MyMouseListener extends MouseAdapter
{
	Applet enclosingApplet;
	
	MyMouseListener(Applet appletHandle)
	{
		enclosingApplet = appletHandle;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		enclosingApplet.showStatus("Mouse CLicked");
	}
}