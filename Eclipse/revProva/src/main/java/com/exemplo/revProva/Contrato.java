package com.exemplo.revProva;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private String nome;
	private List<Item> itens;
	
	public Contrato(String nome) {
		this.nome = nome;
		this.itens = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Item item : itens) {
			total += item.getDiarias() * item.getValorDiaria();
		}
		return total;
	}
	public void listarItens() {
		
		System.out.println("Itens do contrato" + nome + ":");
		for(Item item : itens) {
			System.out.println(item.getNome() + " Diárias: " + item.getDiarias() + " Valor das diárias:" + item.getValorDiaria());;
		}
	}
	
}
