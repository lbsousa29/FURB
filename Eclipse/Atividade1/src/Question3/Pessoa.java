package Question3;

public class Pessoa {
	public double altura;
	public double peso;
	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		
		
		
		
		return imc;
	}
}
