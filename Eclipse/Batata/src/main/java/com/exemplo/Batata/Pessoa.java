package com.exemplo.Batata;

public class Pessoa {
	//Classe  exemplo de Relacionamento
	
	
	private String nome;
	
	public Pessoa (String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		
		this.nome = nome;
	}
}
