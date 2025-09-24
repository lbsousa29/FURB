package com.exemplo.revProva;

public class Item {
	private String nome;
	private int diarias;
	private double valorDiaria;
	
	public Item(String nome, int diarias, double valorDiaria) {
		this.nome = nome;
		this.diarias = diarias;
		this.valorDiaria = valorDiaria;
	}
	
	public String getNome() {
		return nome;
	}
	public int getDiarias() {
		return diarias;
	}
	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
		throw new IllegalArgumentException("Entrada inválida");
		}
		this.nome = nome;
	}
}
