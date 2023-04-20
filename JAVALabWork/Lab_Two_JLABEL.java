import javax.swing.*;
import java.awt.*;

// Create LABEL displaying any text, italics, font size , color + Layout Manager
public class Lab_Two_JLABEL {
 public static void main(String[] args) {

  JFrame frame = new JFrame("Lab Two");
  frame.setLayout(new FlowLayout());
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JLabel label = new JLabel("RANDOM TEXT");
  label.setFont(new Font("MV BOLI", Font.ITALIC, 40));
  label.setForeground(Color.MAGENTA);

  frame.add(label);

  frame.setVisible(true);
  frame.pack();

 }
}
