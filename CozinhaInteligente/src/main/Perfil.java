package main;

public class Perfil {
	private int idPerfil;
	private String nome;
	private String email;
	private String senha;
	private String endereco;
	
	public Perfil() {
		super();
	}
	
	public Perfil(int idPerfil, String nome, String email, String senha, String endereco) {
		super();
		this.idPerfil = idPerfil;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
	}

		
	public int getidPerfil() {
		return idPerfil;
	}

	public void setidPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
