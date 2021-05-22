

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private String usuario = "root";
	private String senha = "Bolotaoclaroma9988";
	private String host = "localHost";
	private String porta = "3306";
	private String bd = "db_projeto";

	public Connection obtemConexao() {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
			return c;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
