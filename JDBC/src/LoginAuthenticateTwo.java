import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

class LoginAuthenticateTwo {
 public static void main(String[] args) throws SQLException {

  // Connection Establish
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava_2023", "root", "sqlroot");

  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter Username : ");
  String username_input = scanner.nextLine();
  System.out.print("Enter Password : ");
  String password_input = scanner.nextLine();

  // SQL Query
  String select_query = "SELECT * FROM User WHERE fullname = '" + username_input + "' AND password = '" + password_input
    + "' ";

  Statement statement = conn.createStatement();
  ResultSet result_set = statement.executeQuery(select_query);

  while (result_set.next()) {

   // Fetching Database Username and Password for Comparing with UserInput
   String username_database = result_set.getString("fullname");
   String password_database = result_set.getString("password");

   if (username_input.equals(username_database) && password_input.equals(password_database)) {
    System.out.println("Login Success");
   } else {
    System.out.println("Wrong Username or Password");
   }
  }

 }
}