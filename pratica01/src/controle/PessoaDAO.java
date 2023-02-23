package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PessoaDAO {

	private static Connection conexao;
	private static PessoaDAO instancia;
	private static final String DATABASE = "jdbc";
	private static final String USER = "root";
	private static final String PSW = "aluno";

	private PessoaDAO() {

	}

	public static PessoaDAO getInstacia() {
		if (instancia == null) {
			instancia = new PessoaDAO();
		}
		return instancia;
	}

	public Connection conectar() {
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE + "?serverTimezone=UTC", USER,
					PSW);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;

	}

	public boolean fecharConexao() {
		try {
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}