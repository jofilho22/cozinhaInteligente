package main;

public class Feedback {
	private int idFeedback;
	private String descricao;
	private int notaQualidade;
	private int notaPraticidade;
	
	public Feedback(int idFeedback,String descricao, int notaQualidade, int notaPraticidade) {		
		super();
		this.idFeedback = idFeedback;
		this.descricao = descricao;
		this.notaQualidade = notaQualidade;
		this.notaPraticidade = notaPraticidade;		
	}	

	public int getidFeedback() {
		return idFeedback;
	}

	public void setidFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNotaQualidade() {
		return notaQualidade;
	}

	public void setNotaQualidade(int notaQualidade) {
		this.notaQualidade = notaQualidade;
	}

	public int getNotaPraticidade() {
		return notaPraticidade;
	}

	public void setNotaPraticidade(int notaPraticidade) {
		this.notaPraticidade = notaPraticidade;
	}
	
}
