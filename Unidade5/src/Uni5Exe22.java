import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double salarioAtual = 2000;
        double aumento = 0.015;

        salarioAtual = salarioAtual + (salarioAtual * aumento);

        int ano = 1997;

        while (ano <= 2023) {
            aumento = aumento * 2;
            salarioAtual = salarioAtual + (salarioAtual * aumento);

            ano++;
        }

        System.out.println("O salário do funcionário nos dias de hoje é R$ " + df.format(salarioAtual));
    }
}
