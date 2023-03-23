package adapterClassGUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

class KeyAdapterClass {

	public static void main(String[] args) {
		new KeyAdapterClassTesting();

	}
}

class KeyAdapterClassTesting extends KeyAdapter {
	JFrame myFrame;

	KeyAdapterClassTesting() {
		myFrame = new JFrame("Key Adapter Testing");
		myFrame.addKeyListener(this);
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}

//	Key Pressed huda INVOKE hunxa
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode() + " : Key Pressed");
	}

//	Pressed vako key Released huda Invoked hunxa
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + " : Key Released");
	}

//	Full Press&Release paxi Invoked
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + " : Key Typed");
	}
}
