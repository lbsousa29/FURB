import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura = 0, somaAltura = 0;
        int qtdPessoas = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe a Altura:");
            altura = teclado.nextDouble();

            somaAltura += altura;
            qtdPessoas++;
        }
        System.out.println("A média de altura é: " + somaAltura / qtdPessoas);

        teclado.close();
    }
}