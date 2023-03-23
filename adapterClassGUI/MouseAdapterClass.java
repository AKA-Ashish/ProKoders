package adapterClassGUI;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseAdapterClass {

	public static void main(String[] args) {
		new AdapterTesting();

	}
}

class AdapterTesting extends MouseAdapter {
	JFrame myFrame;

	AdapterTesting() {
		myFrame = new JFrame("Mouse Adapter Testing");

		myFrame.addMouseListener(this);

		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
//		Creates a graphics Object.
		Graphics graphic = myFrame.getGraphics();
//		graphics object ma Color haleko 
		graphic.setColor(Color.black);
//		oval shape(circle) ma color fill garxa at getX(xaxis) & getY(yaxis)
		graphic.fillOval(e.getX(), e.getY(), 30, 30);
	}
}
