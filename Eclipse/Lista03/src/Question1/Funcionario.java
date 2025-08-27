package Question1;

public class Funcionario {
	private String nome;
	private double salario;
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
	public double calcularIrpf(double salario) {
		
		if (salario <= 1903.98) {
		
		}else if (salario <= 2826.65) {
			salario = salario - 1903.98;
			salario= salario   * 0.075;
			
		}
		
		
		return salario;
	}
	
}
