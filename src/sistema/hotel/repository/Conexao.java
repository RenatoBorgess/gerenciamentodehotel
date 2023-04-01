package sistema.hotel.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	public static void main(String[] args) {
		try {

			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost", "root", "!Rerbinha471");
			System.out.println("Conectou");

			Statement stmt = conexao.createStatement();
			{
				conexao.close();
			}
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao acessar o BD" + e.getMessage());
			e.printStackTrace();

		}

	}
}
