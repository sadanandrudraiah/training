package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends Applet implements MouseListener {
	
	String msg = "";
	
	@Override
	public void init() {
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 50, 50);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		msg = "Mouse Clicked" + e.getX() + "," + e.getY();
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		msg = "Mouse Pressed";
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		msg = "Mouse Released";
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		msg = "Mouse Entered";	
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		msg = "Mouse exited";
		repaint();
	}

}
