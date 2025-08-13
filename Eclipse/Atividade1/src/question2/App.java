package question2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner read = new Scanner(System.in);
		Pessosa2 p = new Pessosa2();
		System.out.println("Digite sua altura:");
		p.altura = read.nextDouble();
		System.out.println("Digite seu peso:");
		p.peso = read.nextDouble();
		double imc = p.calcularImc();
		System.out.println("O IMC calculado é: " + df.format(imc) );
		
		
		read.close();
	}

}
