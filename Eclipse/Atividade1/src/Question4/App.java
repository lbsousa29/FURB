package Question4;

import java.text.DecimalFormat;
import java.util.Scanner;

import Question3.Pessoa;

public class App {
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = LerPessoa();
		}
		Pessoa p = null;
		for (int i = 0; i < pessoas.length; i++) {
			DecimalFormat df = new DecimalFormat("0.00");
			p.calcularImc();
			p = pessoas[i];
			System.out.println("Seu IMC calculado é: " + df.format(p.calcularImc()) );


		}
		}
		
	
	public static Pessoa LerPessoa() {
		double peso, altura;
		Pessoa p =  new Pessoa();
		Scanner read = new Scanner(System.in);
System.out.printf("Seu Nome:");
p.nome = read.nextLine();
		System.out.printf("sua altura:" );
		altura = read.nextDouble();
		System.out.printf("Seu peso:");
		peso = read.nextDouble();
		p.calcularImc();
		p.altura = altura;
		p.peso = peso;
		
		
		
		return p;
	}
}
