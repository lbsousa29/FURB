package Question1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = LerPessoa();
		}
		Pessoa p = null;
		System.out.println("Resultados em ordem inversa");

		for (int i = pessoas.length - 1; i >=0 ; i--) {
			DecimalFormat df = new DecimalFormat("0.00");
			p = pessoas[i];
			System.out.println(p.getNome() +"|"+" Altura: "+ p.getAltura()+"|"+" Peso: "+ p.getPeso()+"|"+ " IMC: " + df.format(p.calcularImc()) );
			

		}
		
		}
		
	
	public static Pessoa LerPessoa() {
		
		Pessoa p =  new Pessoa();
		Scanner read = new Scanner(System.in);
System.out.printf("Seu Nome:");
p.setNome(read.next());
		System.out.printf("Sua altura:" );
		p.setAltura(read.nextDouble());
		System.out.printf("Seu peso:");
		p.setPeso(read.nextDouble()); 
		
		
		
		
		
			return p;
		}
	}
	

