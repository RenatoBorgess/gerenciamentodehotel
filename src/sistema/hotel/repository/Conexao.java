package sistema.hotel.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	private static String username = "root";
	private static String password = "!Rerbinha471";
	private static Connection con;
	private static String urlstring = "jdbc:mysql://localhost/mydb";

	public static Connection getConnection() {

		try {
			con = DriverManager.getConnection(urlstring, username, password);
		} catch (SQLException ex) {
			System.out.println("Failed to create the database connection.");
		}
		return con;

	}

}