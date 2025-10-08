package questao2_empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;
    public Empresa() { funcionarios = new ArrayList<>(); }
    public void incluirFuncionario(Funcionario f) { funcionarios.add(f); }
    public double calcularCustosSalarios() {
        double total = 0.0;
        for (Funcionario f : funcionarios) total += f.calcularSalario();
        return total;
    }
    public java.util.List<Funcionario> getFuncionarios(){ return funcionarios; }
}
