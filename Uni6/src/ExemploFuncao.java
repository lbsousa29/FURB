public class ExemploFuncao {
    public static void main(String[] args) throws Exception {
        // Método de somar dois números inteiros
        ExemploFuncao exemplo = new ExemploFuncao();
        int total = exemplo.somar(10, 20);
        System.out.println("Total: " + total);
        total = exemplo.somar(40, 70);
        System.out.println("Total: " + total);
        // Método de soma dos números decimais
        double valor = exemplo.somarDecimal(7.3, 4.9);
        System.out.println("Soma é: " + valor);
        // Método de saber qual jogador está na vez
        System.out.println("Jogador" + exemplo.jogadorDaVez(5));

    }

    private double somarDecimal(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public String jogadorDaVez(int numeroJogada) {
        if (numeroJogada % 2 == 0) {
            return "Jogador 2";
        } else {
            return "Jogador 1";
        }
    }

}
