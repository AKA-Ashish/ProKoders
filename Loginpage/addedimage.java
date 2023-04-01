package Loginpage;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class addedimage implements ActionListener {

  JTextField tfpw;
  JTextField tfuser; //// textfield declaration which is global variable.
  JButton Login;
  JFrame f;

  public addedimage() {
    f = new JFrame("Login");

    JLabel luser = new JLabel("Username");
    luser.setBounds(20, 20, 150, 25); // Username
    f.add(luser);

    tfuser = new JTextField();
    tfuser.setBounds(180, 20, 150, 25); // Textfield of username
    f.add(tfuser);

    JLabel lpw = new JLabel("Password");
    lpw.setBounds(20, 55, 150, 25); // Password
    f.add(lpw);

    tfpw = new JTextField();
    tfpw.setBounds(180, 55, 150, 25); // Textfield of Password
    f.add(tfpw);

    Login = new JButton("Login");

    Login.addActionListener(this);
    Login.setBounds(180, 90, 150, 25); // For button
    f.add(Login);

    f.setSize(500, 500);
    f.setLayout(null); ///// For frame
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new addedimage();
  }

  @Override
  public void actionPerformed(ActionEvent e) { //factoryMethod(actionPerdormed)
    String luser = tfuser.getText();
    String lpw = tfpw.getText();

    if (luser.equals("admin") && lpw.equals("admin")) {
      ImageIcon icon = new ImageIcon("ASHISH.png");
      JOptionPane.showMessageDialog(
        null,
        "WELCOME SUCCESSFUL PERSON",
        "wow",
        JOptionPane.INFORMATION_MESSAGE,
        icon
      );

      System.out.println("Loged In");
    } else {
      System.out.println("Error");
    }
  }
}
