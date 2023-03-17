package swingGUI;

import javax.swing.*;

public class GUISaveForm {
    public static void main(String[] args) {
        new RegisterForm();
    }
}

class RegisterForm {
    JFrame frame;

    public RegisterForm() {

        frame = new JFrame("Register Form");
        frame.setSize(500, 500);
        frame.setResizable(false);

        JLabel nameLabel = new JLabel("Username");
        JLabel emailLabel = new JLabel("Email");
        JLabel addressLabel = new JLabel("Address");

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField addressField = new JTextField();

        nameLabel.setBounds(50, 10, 150, 25);
        nameField.setBounds(170, 10, 150, 25);

        emailLabel.setBounds(50, 50, 150, 25);
        emailField.setBounds(170, 50, 150, 25);

        addressLabel.setBounds(50, 90, 150, 25);
        addressField.setBounds(170, 90, 150, 25);

        JButton saveButton = new JButton("Save");
        saveButton.setFocusable(false);
        saveButton.setBounds(170, 140, 100, 25);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(saveButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
