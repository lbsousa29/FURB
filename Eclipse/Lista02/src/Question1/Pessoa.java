package Question1;

public class Pessoa {

	private String nome;
	private double altura;
	private double peso;

	public Pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public Pessoa() {
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {

		return nome;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {

		return altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {

		return peso;
	}

	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);

		return imc;
	}

}
