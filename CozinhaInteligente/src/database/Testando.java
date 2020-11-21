package database;

public class Testando {

	public static void main(String[] args) {
		Conexao con = new Conexao();
		
		con.getConnection();
		con.close();
	}
}
