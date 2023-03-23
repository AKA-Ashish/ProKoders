package adapterClassGUI;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class WindowListenerClass {

	public static void main(String[] args) {
		new WindowAdapterClass();

	}
}

class WindowAdapterClass extends WindowAdapter {
	JFrame myFrame;

	WindowAdapterClass() {
		myFrame = new JFrame("Windows Adapter Class");

		myFrame.addWindowListener(this);

		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
	}

}
