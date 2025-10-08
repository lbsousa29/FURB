package questao2_empresa;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario {
    private List<String> linguagens;
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.linguagens = new ArrayList<>();
    }
    public void adicionarLinguagem(String lang) { linguagens.add(lang); }
    public java.util.List<String> getLinguagens(){ return linguagens; }
    @Override
    public double calcularSalario() {
        boolean conheceJava = false;
        for (String l : linguagens) {
            if (l.equalsIgnoreCase("java")) { conheceJava = true; break; }
        }
        if (conheceJava) return salarioBase * 1.20; // 20% a mais
        return salarioBase;
    }
}
