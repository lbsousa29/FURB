package Question4;

public class Pessoa {
	public String nome;
	public double altura;
	public double peso;

	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		
		
		
		return imc;
	}
		
	
}
