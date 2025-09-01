package Question1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	
	Funcionario[] Funcionarios = new Funcionario[5];
	Scanner read = new Scanner(System.in);
    	for (int i = 0; i < Funcionarios.length; i++) {
    		System.out.printf("Digite o nome do funcionário %d:", i + 1 );
    		String setNome = read.nextLine().trim(); 
    		
    		
    		System.out.printf("Digite seu sálario do funcionário %d:", i + 1);
    		Double setSalario = Double.parseDouble(read.nextLine().replace(',', '.'));
    		
    		
    		Funcionario f = new Funcionario();
    		f.setNome(setNome);
    		f.setSalario(setSalario);
    		
    	
    		Funcionarios[i] = f;
		}
	
    	System.out.println("\n---Tabela de funcionários---");
    	
    	for (Funcionario f : Funcionarios) {
    		System.out.printf("Nome: %s\n", f.getNome());
    		System.out.printf("Salário: R$ %.2f\n", f.getSalario());
    		System.out.printf("IRPF: R$ %.2f\n\n", f.calcularIrpf());

		}
    	
    	
}
 }
