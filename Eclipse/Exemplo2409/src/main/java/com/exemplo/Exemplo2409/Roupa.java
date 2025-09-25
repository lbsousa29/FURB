package com.exemplo.Exemplo2409;

public class Roupa {
	protected int tamanho;
	protected String cor;
	
	public Roupa(int tamanho, String cor) {
		setTamanho(tamanho);
		setCor(cor);
	}
	
	public void usar() {
		System.out.println("Usando uma roupa normal");
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
