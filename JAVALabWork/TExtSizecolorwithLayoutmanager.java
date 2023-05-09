
/*Java Program to Display Text with Background Color as Cyan*/

import javax.swing.*;
import java.awt.*;

public class TExtSizecolorwithLayoutmanager {
	// Driver function
	public static void main(String args[]) {
		// Create a frame
		JFrame frame = new JFrame("LayoutManager");

		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.CYAN);
		// Write some text to the frame

		String str = "The Background of Frame is Cyan";
		JLabel text = new JLabel(str);
		text.setFont(new Font("Serif", Font.ITALIC, 20));
		frame.add(text);

		// Set Background Color of Text as red
		text.setForeground(Color.BLUE);
		// Display the frame
		frame.setVisible(true);
	}
}