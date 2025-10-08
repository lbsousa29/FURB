package questao2_empresa;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {
    private double percentualComissao; // em porcentagem, ex: 10.0 para 10%
    private List<Double> vendas;
    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
        this.vendas = new ArrayList<>();
    }
    public void adicionarVenda(double valor) { vendas.add(valor); }
    public double getPercentualComissao(){ return percentualComissao; }
    public List<Double> getVendas(){ return vendas; }
    @Override
    public double calcularSalario() {
        double totalVendas = 0.0;
        for (Double v : vendas) totalVendas += v;
        double comissao = (percentualComissao / 100.0) * totalVendas;
        return salarioBase + comissao;
    }
}
