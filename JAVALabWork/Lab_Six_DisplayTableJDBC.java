import java.sql.*;

public class Lab_Six_DisplayTableJDBC {
 public static void main(String[] args) throws SQLException {

  // Database Details
  String database_url = "jdbc:mysql://localhost:3306/ajava_2023";
  String database_username = "root";
  String database_password = "sqlroot";

  String select_query = "select * from employee_information";

  Connection conn = DriverManager.getConnection(database_url, database_username, database_password);
  System.out.println("Connection Success !");

  PreparedStatement prepared_statement = conn.prepareStatement(select_query);
  ResultSet result_set = prepared_statement.executeQuery();

  while (result_set.next()) {

   int id = result_set.getInt("id");
   String name = result_set.getString("name");
   String email = result_set.getString("email");
   String address = result_set.getString("address");

   System.out.printf("ID : %d | NAME : %s \t | Email : %s \t\t | Address : %s \n", id, name, email, address);
  }

 }
}
