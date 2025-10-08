package questao2_empresa;

public class MainEmpresa {
    public static void main(String[] args) {
        Empresa emp = new Empresa();

        // Vendedores
        Vendedor luiz = new Vendedor("Luiz", 1000.0, 10.0);
        luiz.adicionarVenda(200.0);
        luiz.adicionarVenda(100.0);
        emp.incluirFuncionario(luiz);

        Vendedor paula = new Vendedor("Paula", 1200.0, 7.0);
        paula.adicionarVenda(500.0);
        paula.adicionarVenda(350.0);
        paula.adicionarVenda(280.0);
        emp.incluirFuncionario(paula);

        // Programadores
        Programador julio = new Programador("Julio", 1000.0);
        julio.adicionarLinguagem("C");
        julio.adicionarLinguagem("Java");
        emp.incluirFuncionario(julio);

        Programador ana = new Programador("Ana", 1000.0);
        ana.adicionarLinguagem("Java");
        ana.adicionarLinguagem("C#");
        emp.incluirFuncionario(ana);

        Programador anderson = new Programador("Anderson", 1200.0);
        anderson.adicionarLinguagem("Phyton");
        emp.incluirFuncionario(anderson);

        // Demais funcionarios
        DemaisFuncionario jose = new DemaisFuncionario("José", 1000.0);
        DemaisFuncionario maria = new DemaisFuncionario("Maria", 1400.0);
        emp.incluirFuncionario(jose);
        emp.incluirFuncionario(maria);

        // Saídas requisitadas:
        System.out.printf("Custo total com salários: R$ %.2f\n", emp.calcularCustosSalarios());

        System.out.println("\nLista de funcionários com custo de salário:");
        for (Funcionario f : emp.getFuncionarios()) {
            System.out.printf("- %s: R$ %.2f\n", f.getNome(), f.calcularSalario());
        }

        System.out.println("\nVendedores e percentual de comissão:");
        for (Funcionario f : emp.getFuncionarios()) {
            if (f instanceof Vendedor) {
                Vendedor v = (Vendedor) f;
                System.out.printf("- %s: %.1f%%\n", v.getNome(), v.getPercentualComissao());
            }
        }

        System.out.println("\nProgramadores e linguagens:");
        for (Funcionario f : emp.getFuncionarios()) {
            if (f instanceof Programador) {
                Programador p = (Programador) f;
                System.out.printf("- %s: %s\n", p.getNome(), String.join(", ", p.getLinguagens()));
            }
        }
    }
}
