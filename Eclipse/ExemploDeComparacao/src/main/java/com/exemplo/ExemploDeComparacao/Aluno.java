package com.exemplo.ExemploDeComparacao;

public class Aluno {
	
	private int matricula;
	private String nome;
	private int idade;
	
	public Aluno(int matricula, String nome, int idade) {
		setMatricula(matricula);
		setNome(nome);
		setIdade(idade);
		
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public boolean equals(Object outro) {
		if (this==outro) {
			return true;
		}
		if (this.getClass() != outro.getClass()) {
			return false;
		}
		Aluno outroAluno = (Aluno) outro;
		if (this.nome.equals(outroAluno.getNome())) {
			return false;
		}
		if (this.matricula != outroAluno.getMatricula()) {
			return false;
		}
		if (this.idade != outroAluno.getIdade()) {
			return false;
		}
		return false;
		
	}
}
