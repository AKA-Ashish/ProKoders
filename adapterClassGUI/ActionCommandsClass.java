package adapterClassGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ActionCommandsClass {

	public static void main(String[] args) {
		new ActionEventTesting();
	}
}

class ActionEventTesting implements ActionListener {
	JFrame myFrame;
	JButton btn1;
	JButton btn2;

	ActionEventTesting() {
		myFrame = new JFrame("Action Command Testing");
		btn1 = new JButton("Btn1");
		btn1.setBounds(140, 150, 100, 30);

		btn1.setActionCommand("btnclick");

		btn2 = new JButton("Btn2");
		btn2.setBounds(260, 150, 100, 30);

//		Action Command deko ""
		btn1.setActionCommand("btnclick1");
		btn1.addActionListener(this);
		
		btn2.setActionCommand("btnclick2");
		btn2.addActionListener(this);

		myFrame.add(btn1);
		myFrame.add(btn2);
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("btnclick1")) {
			System.out.println("Button 1 Clicked");
		} else if (e.getActionCommand().equals("btnclick2")) {
			System.out.println("Button 2 Clicked");
		}
	}

}
