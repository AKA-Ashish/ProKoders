package adapterClassGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

class MouseMotionAdapterClass {

	public static void main(String[] args) {
		new AdapterMotionTesting();
	}

}

class AdapterMotionTesting extends MouseMotionAdapter {
	JFrame myFrame;

	AdapterMotionTesting() {
		myFrame = new JFrame("Mouse Motion Adapter Testing");

		myFrame.addMouseMotionListener(this);

		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}

//	Mouse Click and Hold + drag garda invoke hunxa
	public void mouseDragged(MouseEvent e) {
		Graphics g = myFrame.getGraphics();
		g.setColor(Color.red);
		g.fillOval(e.getX(), e.getY(), 5,5);
	}
}
