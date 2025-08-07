package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua altura e peso:");
		
		double altura = teclado.nextDouble();
		double peso = teclado.nextDouble();
		double resultado = peso / (altura * altura);
		
		System.out.println("O seu IMC é " + df.format(resultado));
		
		teclado.close();
	}

}
