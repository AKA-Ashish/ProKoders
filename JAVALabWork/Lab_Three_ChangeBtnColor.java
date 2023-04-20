import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Lab_Three_ChangeBtnColor {

 // Change Button Color everytime its Clicked
 public static void main(String[] args) {
  new Change_Btn_Child();
 }

}

class Change_Btn_Child implements ActionListener {

 JButton button;

 Random random = new Random();

 Change_Btn_Child() {

  JFrame frame = new JFrame("COLOR CHANGING BUTTON");
  frame.setBounds(200, 150, 500, 500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLayout(null);

  button = new JButton("CHANGE COLOR");
  button.setBounds(150, 220, 200, 30);
  button.addActionListener(this);
  frame.setFocusable(true);
  frame.add(button);

  frame.setVisible(true);
 }

 public void actionPerformed(ActionEvent e) {

  if (e.getSource() == button) {

   // Creating 3 random Numbers . Float 0-0.99 or Int 0-255
   float x = random.nextFloat();
   float y = random.nextFloat();
   float z = random.nextFloat();

   // Random Generated color lai 'my_color' ma store gareko
   Color my_color = new Color(x, y, z);

   // button.setForeground(my_color); //button text color
   button.setBackground(my_color); // button background color
  }
 }
}
