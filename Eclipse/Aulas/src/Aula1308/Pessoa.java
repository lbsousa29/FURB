package Aula1308;

public class Pessoa {
	private String nome;
	double peso;
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getNome() {
		
		
		
		return nome;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		if (peso <= 0) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		
		return peso;
	}
}
