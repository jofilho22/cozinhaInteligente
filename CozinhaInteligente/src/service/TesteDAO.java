package service;

import main.Anuncio;
import main.Feedback;
import main.Ingrediente;
import main.Perfil;
import main.Receita;

public class TesteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PCookDAO dao = new PCookDAO();
		Receita r = new Receita(2,"doideira", "nadamsm", "merda", 15, 166);
		Anuncio a = new Anuncio(1,"nada","testando","teste");
		Feedback f = new Feedback(1,"dusadhusauhd",2,6);
		Ingrediente i = new Ingrediente(1,"dsadsadsa",166);
		Perfil p = new Perfil(1,"conti machado","kkkkkk","dsssss@@.com","ddsad115s");
		
		//TESTE RECEITAS
		//Sem ser consultar as receitas, só os administradores podem mexer em cadastro de receitas
		//dao.consultarReceita(r);
		//dao.cadastrarReceita(r);
		//dao.excluirReceita(2);
		//dao.editarReceita(r);
		
		//TESTES ANUNCIO
		//Possibilidades só para o usuario cliente
		//dao.cadastrarAnuncio(a);
		//dao.editarAnuncio(a);
		//dao.excluirAnuncio(1);
		
		//TESTE FEEDBACK
		//Enviar feedback o usuario pode e consultar só o administrador
		//dao.enviarFeedback(f);
		//dao.consultarFeedback(f);
		
		//TESTE INGREDIENTE
		//Tudo sobre ingredientes só o adiminstrador pode mexer
		//dao.cadastrarIngrediente(i);
		//dao.excluirIngrediente(1);
		
		//TESTE DE PERFIL/CADASTRADO USUARIO
		//dao.cadastrarPerfil(p);
		//dao.consultarPerfilComun(p);
		//dao.editarPerfilComum(p);
		
		
	}

}
