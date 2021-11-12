package br.edu.infinet.model.domain;

public class Usuario {
	
	private String nome;
	private String email;
	
	//Contrutor - nome da classe
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	//tostring
	@Override
	public String toString() {
		return String.format("Usuario: %s   -  E-Mail: %s",
			nome,
			email);
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

}
