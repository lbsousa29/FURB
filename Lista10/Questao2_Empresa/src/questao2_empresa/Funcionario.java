package questao2_empresa;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public String getNome(){ return nome; }
    public double getSalarioBase(){ return salarioBase; }
    public abstract double calcularSalario();
}
