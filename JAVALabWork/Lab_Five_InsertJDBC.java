import java.sql.*;

public class Lab_Five_InsertJDBC {
 public static void main(String[] args) throws SQLException {

  // Database Details
  String database_url = "jdbc:mysql://localhost:3306/ajava_2023";
  String database_username = "root";
  String database_password = "sqlroot";

  String insert_query = "insert into employee_information(name,email,address) values (?,?,?);";

  Connection conn = DriverManager.getConnection(database_url, database_username, database_password);
  System.out.println("Connection Success !");

  String name = "amit";
  String email = "amit@gmail.com";
  String address = "Swoyambhu";

  PreparedStatement prepared_statement = conn.prepareStatement(insert_query);
  prepared_statement.setString(1, name);
  prepared_statement.setString(2, email);
  prepared_statement.setString(3, address);

  prepared_statement.executeUpdate();
  System.out.println("Insert Success");

 }
}

// DATABASE NAME : ajava_2023

// mysql> create table employee_information (id INT AUTO_INCREMENT PRIMARY KEY ,
// name VARCHAR(50) , email VARCHAR(100) , address VARCHAR(50) );
