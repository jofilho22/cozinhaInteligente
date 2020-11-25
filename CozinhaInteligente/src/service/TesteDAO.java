package service;

import main.Receita;

public class TesteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pCookDAO dao = new pCookDAO();
		Receita r = new Receita(1,"Banana", "Brasil", "Muito", 15, 15600);

		dao.cadastrarReceitar(r);

	}

}
