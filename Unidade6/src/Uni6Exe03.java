import java.util.Scanner;

public class Uni6Exe03 {

    private Uni6Exe03() {
        Scanner teclado = new Scanner(System.in);

        double vetorValores[] = new double[12];

        ler(vetorValores, teclado);
        ajustarVetor(vetorValores);
        imprimirVetor(vetorValores);

        teclado.close();
    }

    private void ler(double vet[], Scanner tec) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("vetor[" + i + "]: ");
            vet[i] = tec.nextDouble();
        }
    }

    private void ajustarVetor(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (i % 2 == 0) {// par
                // aplicamos 5% acréscimo sobre o valor do vetor
                vet[i] += ((5.0 / 100) * vet[i]);
            } else {// ímpar
                vet[i] += ((2.0 / 100) * vet[i]);
            }
        }
    }

    private void imprimirVetor(double vetor[]){
        System.out.println(" **** Imprimindo Vetor Ajustado ****");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}