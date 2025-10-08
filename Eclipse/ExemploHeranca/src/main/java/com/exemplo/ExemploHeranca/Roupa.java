package com.exemplo.ExemploHeranca;

public abstract class Roupa {
	protected String tecido;
	protected String cor;
	protected int tamanho;
	
	public Roupa(String tecido, String cor, int tamanho) {
		setTecido(tecido);
		setCor(cor);
		setTamanho(tamanho);
	}
	
	
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
