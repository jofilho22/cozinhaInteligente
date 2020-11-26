package main;

public class Ingrediente {
	private int idIngrediente;
	private String nomeIngrediente;
	private float valorCalorico;
	
	public Ingrediente(int idIngrediente, String nomeIngrediente, float valorCalorico) {
		super();
		this.idIngrediente = idIngrediente;
		this.nomeIngrediente = nomeIngrediente;
		this.valorCalorico = valorCalorico;	
	}

	public int getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public float getValorCalorico() {
		return valorCalorico;
	}

	public void setValorCalorico(float valorCalorico) {
		this.valorCalorico = valorCalorico;
	}
	
	
}
