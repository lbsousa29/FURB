package Imc;

public class Pessoa {
	double altura;
	double peso;
	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		
		
		
		
		return imc;
	}
	

}
