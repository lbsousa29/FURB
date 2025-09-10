package com.exemplo.ExemploArrayList;

public class Aluno {
	private String nome;	
	private int idade;
	
	public Aluno(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	
			
		public void setIdade(int idade) {
		
			
			this.idade = idade;
	}



			
	public int getIdade() {
		return idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public Aluno(String nome) {
		setNome(nome);
	}
	private void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome inválido");
			
		}
	}
}
