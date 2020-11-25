package main;


public class Receita {
	private int idReceita;
	private String nome;
	private String categoria;
	private String ingrediente;
	private int quantidadeIngrediente;
	private float valorCalorico;
	
	public Receita() {
		
	}
	
	public Receita(int idReceita,String nome, String categoria, String ingrediente, int quantidadeIngrediente, float valorCalorico) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.ingrediente = ingrediente;
		this.quantidadeIngrediente = quantidadeIngrediente;
		this.valorCalorico = valorCalorico;
		
	}

	
	public int getIdReceita() {
		return idReceita;
	}

	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getQuantidadeIngrediente() {
		return quantidadeIngrediente;
	}

	public void setQuantidadeIngrediente(int quantidadeIngrediente) {
		this.quantidadeIngrediente = quantidadeIngrediente;
	}


	public float getValorCalorico() {
		return valorCalorico;
	}

	public void setValorCalorico(float valorCalorico) {
		this.valorCalorico = valorCalorico;
	}


}
