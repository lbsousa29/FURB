package Question2;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	

	public Funcionario() {
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calcularIrpf() {
		
		if (salario <= 1903.98) {
		
		}else if (salario <= 2826.65) {
			salario = salario - 1903.98;
			salario= salario   * 0.075;
			
		}else if (salario <= 3751.05) {
			salario = salario - 2826.65;
			salario= salario   * 0.15;
			
		}else if (salario <= 4664.68) {
			salario = salario - 3751.05;
			salario= salario   * 0.225;
			
		}else if (salario >= 4664.68) {
			salario = salario - 4664.68;
			salario= salario   * 0.275;
			
		}
		
		
		return salario;
	}
	
	
}
