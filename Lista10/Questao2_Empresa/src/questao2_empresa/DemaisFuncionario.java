package questao2_empresa;

public class DemaisFuncionario extends Funcionario {
    public DemaisFuncionario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
