package database;

import java.sql.*;

public class Conexao {

	//interfaces
			public Connection con = null;
			public PreparedStatement st = null;
			public ResultSet rs = null;
			private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			private final String BANCO = "pCook";
			private final String URL = "jdbc:sqlserver://localhost:1433;databasename="+BANCO;
			private final String LOGIN = "sa";
			private final String SENHA = "123456";
			

			/**
			 * Faz a conexão com o banco de dados sql
			 * @return - retorna true caso conecte, ou falso caso de algum erro
			 */
			public boolean getConnection() {
				try {
					Class.forName(DRIVER);
					con = DriverManager.getConnection(URL,LOGIN,SENHA);
					System.out.println("Conectado!!");
					return true;
				}
				catch(SQLException erro){
					System.out.println("Falha na conexão"+ erro.getMessage());
				}
				catch(ClassNotFoundException erro){
					System.out.println(erro.getMessage());
				}	
				return false;
			}
			/**
			 * Reliza a finalização da conexão com o banco de dados
			 */
			public void close() {
				try {
					if(rs!=null) {
						rs.close();
					}
				}
				catch(SQLException erro){
					
				}
				
				try {
					if(st!=null) {
						st.close();
					}
				}
				catch(SQLException erro){
					
				}
				
				try {
					if(con!=null) {
						con.close();
						System.out.println("Desconectado!!");
					}
				}
				catch(SQLException erro){
					
				}
			}
			
}
