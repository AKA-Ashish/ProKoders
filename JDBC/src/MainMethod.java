import java.sql.*;

public class MainMethod {

  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3306/bcajava_2023";
    String username = "root";
    String password = "sqlroot";
    try {
      // Loading/Register SQL Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //   Establish connection with database
      Connection conn = DriverManager.getConnection(url, username, password);
      System.out.println("Conenction Successfully executed");
      //   Passing conn value
      new LoginFormGUI(conn);
    } catch (SQLException e) {
      System.out.println("Error Connecting to Database : " + e.getMessage());
    }
  }
}
// DATABASE Name: bcajava_2023
// Username : root
// Password : sqlroot
// Table : CREATE TABLE User ( username VARCHAR(50) PRIMARY KEY NOT NULL, password VARCHAR(50) );
