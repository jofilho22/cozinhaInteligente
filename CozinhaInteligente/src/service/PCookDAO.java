package service;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import database.Conexao;
import main.Anuncio;
import main.Feedback;
import main.Ingrediente;
import main.Perfil;
import main.Receita;


public class PCookDAO {

	private String sql,men;
	private Conexao conexao;
	
	public PCookDAO() {
		conexao = new Conexao();
	}
	
	/**
	 * Realiza o cadastro de receitas no banco
	 * @param r - Receita que vai ser cadastrada
	 */
	public void cadastrarReceita(Receita r) {
		sql = "insert into receita values (?,?,?,?,?,?)";
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
			JOptionPane.showMessageDialog(null, "Receita " +r.getNome()+ " cadastrada com sucesso!!");		
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
		
	}
	
	/**
	 * Realiza a consulta de receitas do banco
	 * @param r - Receita que vai ser consultada
	 * @return - A receita que foi consultada
	 */
	public Receita consultarReceita(Receita r) {
		sql = "select * from receita where idReceita=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, r.getIdReceita());
			conexao.st.executeUpdate();
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
		return r;
	}
	
	/**
	 * Realiza a edição de receitas no banco
	 * @param r - Receita que vai ser editada
	 */
	public void editarReceita(Receita r) {
		
		sql = "Update receita set nome_receita=?,categoria=?,ingrediente=?,quant_ingrediente=?,valor_calorico=? where idReceita=?";
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
			JOptionPane.showMessageDialog(null, "Receita editada com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
	}
	
	/**
	 * Faz a exclusão de receitas do banco de dados
	 * @param idReceita - Id da receita que vai ser excluida
	 */
	public void excluirReceita(int idReceita) {
		sql = "delete from receita where idReceita = ?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, idReceita);
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Receita excluida com sucesso");
		}
		catch(SQLException erro){
			System.out.println("Problema :"+erro+"");
		}
		finally{
			conexao.close();
		}

	}
	
	/**
	 * Realiza o cadastro do anuncio no banco
	 * @param a - Anuncio que vai ser cadastrado no banco
	 */
	public void cadastrarAnuncio(Anuncio a) {
		sql = "insert into anuncio values (?,?,?,?)";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, a.getIdAnuncio());
			conexao.st.setString(2, a.getNomeMarca());
			conexao.st.setString(3, a.getNomeProduto());
			conexao.st.setString(4, a.getPais());
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Produto " +a.getNomeProduto() +" anúnciado com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
	}
	
	/**
	 * Realiza a edição do anuncio no banco
	 * @param a - Anuncio que vai ser editado no banco
	 */
	public void editarAnuncio(Anuncio a) {
		sql = "update anuncio set nomeMarca=?,nomeProduto=?,pais=? where idAnuncio=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setString(1, a.getNomeMarca());
			conexao.st.setString(2, a.getNomeProduto());
			conexao.st.setString(3, a.getPais());
			conexao.st.setInt(4, a.getIdAnuncio());
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Anúncio "+a.getNomeProduto()+" editado com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
		
	}
	
	/**
	 * Realiza a exclusão de um anuncio no banco
	 * @param idAnuncio - Id do anuncio que vai ser excluido do banco
	 */
	public void excluirAnuncio(int idAnuncio) {
		sql = "delete from anuncio where idAnuncio = ?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, idAnuncio);
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Anúncio excluido com sucesso!!");
		}
		catch(SQLException erro){
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
	}
		
	/**
	 * Realiza os envios de feedback do usuário para o banco
	 * @param f - Feedback que vai ser enviado
	 */
	public void enviarFeedback(Feedback f) {
		sql = "insert into feedback values(?,?,?,?)";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, f.getidFeedback());
			conexao.st.setString(2, f.getDescricao());
			conexao.st.setInt(3, f.getNotaQualidade());
			conexao.st.setInt(4, f.getNotaPraticidade());
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Feedback enviado com sucesso, agradecemos seu apoio!!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
	}
	
	/**
	 * Realiza a consulta do feedback no banco pelo adiminstrado do sistema
	 * @param f- Feedback que vai ser consultado
	 * @return - Retorna o feedback que foi procurado
	 */
	public Feedback consultarFeedback(Feedback f) {
		sql = "select * from feedback where idFeedback=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, f.getidFeedback());
			conexao.st.executeUpdate();			
		}
		catch(SQLException erro) {
			men = erro.toString();
		}
		finally {
			conexao.close();
		}
		return f;	
	}
	
	/**
	 * Realiza o cadastro de ingredientes no banco
	 * @param i - Ingrediente que vai ser cadastrado
	 */
	public void cadastrarIngrediente(Ingrediente i) {
		sql = "insert into ingrediente values(?,?,?)";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, i.getIdIngrediente());
			conexao.st.setString(2, i.getNomeIngrediente());
			conexao.st.setFloat(3, i.getValorCalorico());
			conexao.st.executeUpdate();		
			JOptionPane.showMessageDialog(null, "Ingredient "+i.getNomeIngrediente()+" cadastrado com sucesso!!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}	
	}
	
	/**
	 * Realiza a exclusão de um ingrediente do banco
	 * @param idIngrediente - Id do ingrediente que vai ser excluido
	 */
	public void excluirIngrediente(int idIngrediente) {
		sql = "delete from ingrediente where idIngrediente=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, idIngrediente);
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Ingrediente excluido com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
	}
	
	/**
	 * Realiza o cadastro de um usuario
	 * @param p - Perfil que vai ser cadastrado
	 */
	public void cadastrarPerfil(Perfil p) {
		sql = "insert into perfil values(?,?,?,?,?)";
		try {	
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, p.getidPerfil());
			conexao.st.setString(2, p.getNome());
			conexao.st.setString(3, p.getEmail());
			conexao.st.setNString(4, p.getSenha());
			conexao.st.setString(5, p.getEndereco());
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Perfil "+p.getNome()+" cadastrado com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro.toString());
		}
		finally {
			conexao.close();
		}
	}
	
	/**
	 * Realiza a consulta do perfil do usuario comun no banco
	 * @param p - Perfil que vai ser procurado
	 * @return - Perfil que foi encontrado
	 */
	public Perfil consultarPerfilComun(int idPerfil) {
		Perfil p = new Perfil();
		sql = "select * from perfil where idPerfil=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, idPerfil);
			conexao.rs = conexao.st.executeQuery();
			if(conexao.rs.next()) {
				p.setidPerfil(conexao.rs.getInt(1));
				p.setNome(conexao.rs.getString(2));
				p.setEmail(conexao.rs.getString(3));
				p.setSenha(conexao.rs.getString(4));
				p.setEndereco(conexao.rs.getString(5));
			}
			else {
				p = null;
			}

			}
			catch(SQLException erro){
				p = null;
			}
			finally{
				conexao.close();
			}
			return p;
		}

	
	/**
	 * Edita o perfil desejado pelo usuário
	 * @param p - Perfil que vai ser editado
	 */
	public void editarPerfilComum(Perfil p) {
		sql = "update perfil set nome=?,email=?,senha=?,endereco=? where idPerfil=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setString(1, p.getNome());
			conexao.st.setString(2, p.getEmail());
			conexao.st.setString(3, p.getSenha());
			conexao.st.setString(4, p.getEndereco());
			conexao.st.setInt(5, p.getidPerfil());
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Perfil do "+p.getNome()+" editado com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro.toString());
		}
		finally {
			conexao.close();
		}
	}
	
	public void excluirPerfil(int idPerfil) {
		sql = "delete from perfil where idPerfil=?";
		try {
			conexao.getConnection();
			conexao.st = conexao.con.prepareStatement(sql);
			conexao.st.setInt(1, idPerfil);
			conexao.st.executeUpdate();
			JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!!");
		}
		catch(SQLException erro) {
			System.out.println("Problema :"+erro+"");
		}
		finally {
			conexao.close();
		}
	}
}
