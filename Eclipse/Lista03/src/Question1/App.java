package Question1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	
	Scanner read = new Scanner(System.in);
	System.out.println("Digite seu nome:" );
	String setNome = read.nextLine(); 
	System.out.println("Digite seu sálario:");
	Double setSalario = read.nextDouble();
	Funcionario  F = new  Funcionario(setNome, setSalario);
	String nome = null;
	F.setNome(nome);
	double salario = 0;
	F.setSalario(salario);
	System.out.println("Imposto do seu salario é " + F.calcularIrpf(setSalario) );
	
	read.close();
}
 }
