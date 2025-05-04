import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorComp = 1;
        double valorTotal = 0;

        while (valorComp != 0) {
            System.out.println("Insira valor da compra: ");
            valorComp = teclado.nextDouble();

            if (valorComp > 500) {
                valorComp = valorComp * 0.8;
                valorTotal = valorComp;
                System.out.printf("O valor a pagar é: R$%.2f\n", valorComp);
            }

            if (valorComp <= 500 && valorComp != 0) {
                valorComp = valorComp * 0.85;
                valorTotal += valorComp;
                System.out.printf("O valor a pagar é: R$%.2f\n", valorComp);
            }
        }

        System.out.printf("O total recebido pela loja é: R$%.2f", valorTotal);

        teclado.close();
    }
}
