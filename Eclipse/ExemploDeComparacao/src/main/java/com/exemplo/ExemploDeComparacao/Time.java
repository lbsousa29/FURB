package com.exemplo.ExemploDeComparacao;

public class Time {
	private String nome;
	private int pontos;
	private int gols;
	
	public Time(String nome, int pontos, int gols) {
		 setNome(nome);
		setPontos(pontos);
		setGols(gols);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this.getClass() != o.getClass()) {
			return false;
		}
		Time outro = (Time) o;
		if (!this.nome.equals(outro.getNome())) {
			return false;
		}
		if (this.pontos != outro.getPontos()) {
			return false;
		}
		if (this.gols != outro.getGols()) {
			return false;
		}
		
		
		
		
		return true;
	}
	
	
	
	
public int compareTO(Time o) {
	return this.nome.compareTo(o.getNome());
	
}}
