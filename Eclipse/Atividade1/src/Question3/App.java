package Question3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner read = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			
		
		
		Pessoa p = new Pessoa();
		System.out.printf("Pessoa %d sua altura:", i);
		p.altura = read.nextDouble();
		System.out.printf("Pessoa %d seu peso:", i);
		p.peso = read.nextDouble();
		double imc = p.calcularImc();
		System.out.println("Seu IMC calculado é: " + df.format(imc) );
		
		}
		read.close();
	}

}
