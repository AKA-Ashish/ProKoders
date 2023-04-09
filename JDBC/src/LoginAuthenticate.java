import java.sql.*;
import java.util.Scanner;

class LoginAuthentication {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava_2023", "root", "sqlroot");
			System.out.println("Connection Success");

			new LoginAuthenticationHandler(conn);

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}

class LoginAuthenticationHandler {
	Connection myConnection;
	Scanner scanner = new Scanner(System.in);

	String select_query = "select * from User where fullname = ?";

	LoginAuthenticationHandler(Connection conn) {
		this.myConnection = conn;

		System.out.println("Enter Username : ");
		String userinput_username = scanner.nextLine();

		System.out.println("Enter Password : ");
		String userinput_password = scanner.nextLine();
		scanner.close();
		try {

			PreparedStatement prepared_statement = myConnection.prepareStatement(select_query);
			prepared_statement.setString(1, userinput_username);
			ResultSet result_set_username = prepared_statement.executeQuery();

			if (result_set_username.next()) {
				if (result_set_username.getString("password").equals(userinput_password)) {
					System.out.println("Login Success");
				} else {
					System.out.println("Login Failed ! ");
				}
			} else {
				System.out.println("Account Doesnt Exits ! ");
			}

		} catch (SQLException err) {
			System.out.println("Login Authentication Failed : " + err.getMessage());
		}
	}
}

// <----------------------DATABASE DETAILS----------------------->

// Database name : ajava_2023 , root, sqlroot
// create table User ( id INT PRIMARY KEY AUTO_INCREMENT, fullname VARCHAR(50)
// UNIQUE , password VARCHAR(50) );
// insert into User(fullname,password) values ( "amit","amit123") ,
// ("anant","anant123");
