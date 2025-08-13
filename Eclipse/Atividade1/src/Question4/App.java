package Question4;

import java.text.DecimalFormat;
import java.util.Scanner;

import Question3.Pessoa;

public class App {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner read = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3] ;
		for (int i = 1; i <pessoas.length; i++) {
			
		
		System.out.printf("Pessoa %d seu Nome:", i);
		String nome = read.next();
		Pessoa p = new Pessoa();
		System.out.printf("Pessoa %d sua altura:", i);
		double altura = read.nextDouble();
		System.out.printf("Pessoa %d seu peso:", i);
		double peso = read.nextDouble();
		double imc = p.calcularImc();
		System.out.println("Seu IMC calculado é: " + df.format(imc) );
		
			
			pessoas[i] = new Pessoa(nome, altura, peso);
			
		
		}
		read.close();
	}
}
