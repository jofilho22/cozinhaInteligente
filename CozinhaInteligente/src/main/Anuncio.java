package main;

public class Anuncio {
	private int idAnuncio;
	private String nomeMarca;
	private String nomeProduto;
	private String pais;
	
	public Anuncio(int idAnuncio, String nomeMarca, String nomeProduto, String pais) {
		super();
		this.idAnuncio = idAnuncio;
		this.nomeMarca = nomeMarca;
		this.nomeProduto = nomeProduto;
		this.pais = pais;
	}
	

	public int getIdAnuncio() {
		return idAnuncio;
	}


	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}


	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}

