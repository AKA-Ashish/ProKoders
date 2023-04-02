import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class LoginFormGUI extends JFrame implements ActionListener {

  // Labels Declarations
  JLabel username_label;
  JLabel password_label;

  // TextField Declarations
  JTextField username_field;
  JPasswordField password_field;

  //   Button Declarations
  JButton button;

  //   Sql Declarations
  Connection conn;
  PreparedStatement prepared_statement;

  LoginFormGUI(Connection conn) {
    this.conn = conn;
    // Frame Setup
    setTitle("Login Database");
    setBounds(500, 300, 500, 500);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Username Label Setup
    username_label = new JLabel("Username");
    username_label.setBounds(100, 10, 100, 30);
    add(username_label);

    // Password Label Setup
    password_label = new JLabel("Password");
    password_label.setBounds(100, 50, 100, 30);
    add(password_label);

    // Username Text Field Setup
    username_field = new JTextField();
    username_field.setBounds(220, 10, 200, 30);
    add(username_field);

    // Password Text Field Setup
    password_field = new JPasswordField();
    password_field.setBounds(220, 50, 200, 30);
    add(password_field);

    // Button Setup
    button = new JButton("Save");
    button.setBounds(250, 100, 100, 30);
    add(button);
    button.setActionCommand("btn");
    button.addActionListener(this);

    setVisible(true);
  }

  //   SQL Insert Query
  String query_insert = "INSERT INTO User VALUES ( ?,? );";

  public void actionPerformed(ActionEvent e) {
    // Condition for if "btn" is clicked

    if (e.getActionCommand().equals("btn")) {
      // Storing input field data into variables
      String get_username = username_field.getText();
      char get_password[] = password_field.getPassword();

      try {
        // Telling Prepare Statement which query to perform
        prepared_statement = conn.prepareStatement(query_insert);

        // Defining values for Query (? ?)
        prepared_statement.setString(1, get_username);
        prepared_statement.setString(2, new String(get_password)); // Char to String convert

        // Executing Query
        prepared_statement.execute();

        System.out.println("Insertion Successful");
      } catch (SQLException err) {
        System.out.println("Insertion Failed : " + err.getMessage());
      }
    }
  }
}
