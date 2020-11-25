package service;

import java.sql.SQLException;

import database.Conexao;
import main.Receita;
import model.Produto;

public class pCookDAO {

	private String sql,men;
	private Conexao conexao;
	
	public pCookDAO() {
		conexao = new Conexao();
	}
	
	/**
	 * Realiza o cadastro da receita no banco de dados
	 * @param r - Receita que vai ser cadastrada
	 * @return - Mensagem com o resultado da operação
	 */
	public String cadastrarReceitar(Receita r) {
		sql = "insert into receitas values (?,?,?,?,?,?)";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, r.getIdReceita());
			conexao.st.setString(2, r.getNome());
			conexao.st.setString(3, r.getCategoria());
			conexao.st.setString(4, r.getIngrediente());
			conexao.st.setInt(5, r.getQuantidadeIngrediente());
			conexao.st.setFloat(6, r.getValorCalorico());
			conexao.st.executeUpdate();
			men = "Receita :" + r.getNome() + " cadastrada com sucesso!!";
		}
		catch(SQLException erro) {
			men = "Erro : "+ erro+ "";
		}
		finally {
			conexao.close();
		}
		return men;
	}
	
	/**
	 * Realiza a edição da receitas
	 * @param r - Receita que vai ser editada
	 * @return - Mensagem com o resultado da operação
	 */
	public String editarReceita(Receita r) {
		
		sql = "Update receitas set nome_receita=?,categoria=?,ingrediente=?,quant_ingredientes=?,valor_calorico=? where id_receita=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setString(1, r.getNome());
			conexao.st.setString(2, r.getCategoria());
			conexao.st.setString(3, r.getIngrediente());
			conexao.st.setInt(4, r.getQuantidadeIngrediente());
			conexao.st.setFloat(5, r.getValorCalorico());
			conexao.st.setInt(6, r.getIdReceita());
			conexao.st.executeUpdate();
			men = "Receita :" + r.getNome() + " editada com sucesso!!!";
		}
		catch(SQLException erro) {
			men = "ERRO : "+erro+"";
		}
		finally {
			conexao.close();
		}
		return men;
	}
	
	/**
	 * Faz a exclusão de receitas do banco de dados
	 * @param idReceita - Id da receita que vai ser excluida
	 * @return - Mensagem com o resultado da operação
	 */
	public String excluir(int idReceita) {
		sql = "delete from receitas where id_receita = ?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql)
			conexao.st.setInt(1, idReceita);
			conexao.st.executeUpdate();
			
			men = "receita excluida com sucesso!!";
		}
		catch(SQLException erro){
			men = "Problema"+ erro.toString();
		}
		finally{
			conexao.close();
		}
		return men;
	}
	
	
}
