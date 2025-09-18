package com.exemplo.Aula1709;

public class Pessoa {

	private String nome;
	private Pessoa filho;
	private Veiculo veiculo;
	public int contarGeracoes() {
		int contador = 1;
		Pessoa p = filho;
		while(p != null) {
			contador++;
			p = p.getFilho();
		}
		return contador;
	}
	
	public int contarGeracoesRecursivo() {
		if (filho == null) {
			return 1;
		}
		return 1 + filho.contarGeracoesRecursivo();
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa getFilho() {
		return filho;
	}
	public void setFilho(Pessoa filho) {
		this.filho = filho;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
