package swingGUI;

import javax.swing.*;

public class GUILogin {

    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Creating a FRAME
        frame.setSize(500, 500);

        JLabel username = new JLabel("Username : ");
        JTextField usernameField = new JTextField(); // Username FIELD

        JLabel password = new JLabel("Password : ");
        JPasswordField passwordField = new JPasswordField();

        JButton button = new JButton("LOGIN"); // Creating Button with TEXT Login

        frame.add(username);
        frame.add(usernameField);

        frame.add(password);
        frame.add(passwordField);

        frame.add(button);

        username.setBounds(10, 10, 100, 25);
        usernameField.setBounds(120, 10, 100, 25);

        password.setBounds(10, 50, 100, 25);
        passwordField.setBounds(120, 50, 100, 25);

        button.setBounds(25, 120, 100, 25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
