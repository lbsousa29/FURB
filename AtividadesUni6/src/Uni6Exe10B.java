import java.util.Scanner;

public class Uni6Exe10B {
    private Uni6Exe10B() {
        int opcao = 0;
        int vet[] = new int[50];
        int posicao = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 8");
        do {
            System.out.println("Menu");
            System.out.println("1- Incluir valor");
            System.out.println("2- Pesquisar valor");
            System.out.println("3- Alterar valor");
            System.out.println("4- Excluir valor");
            System.out.println("5- Mostrar valores");
            System.out.println("6- Ordenar valores");
            System.out.println("7- Inverter valores");
            System.out.println("8- Sair do sistema");
            opcao = teclado.nextInt();
            System.out.println("Opção Digitada " + opcao);
            switch (opcao) {
                case 1:
                    posicao = incluirValor(vet, posicao, teclado);
                    break;
                case 2:
                    pesquisarValor(vet, teclado);

                    break;
                case 3:
                    
                    
                    alterar( vet, posicao, teclado);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    inverter(vet);
                    break;
                case 8:
                    System.out.println("FIM");
                    break;

                default:
                    System.out.println("ERROR");
                    break;
            }
        } while (opcao != 8);

    }

    private void inverter(int[] vet /*posição final no vetor */) {
        int temp = 0;
        for(int i = 0;   /* i menor que a posição final;/* */; i++);
    }

    private  void alterar( int[] vet, int posicao, Scanner teclado) {
            int indice = pesquisarValor(vet, teclado);
    }
    private int pesquisarValor(int[] vet, Scanner teclado) {
        int numeroDigitado = teclado.nextInt();
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == numeroDigitado) {
                System.out.println("Valor " + numeroDigitado + " encontrado na posição vet[" + i + "]");
                return i;
            }
        }
        return -1;

    }

    private int incluirValor(int[] vet, int posicao, Scanner teclado) {
        System.out.println("Digite um número");
        int numero = teclado.nextInt();
        if (posicao < vet.length) {
            vet[posicao] = numero;
            System.out.println("Número " + numero + " Inserido na posição vet[" + posicao + "]");

        } else {
            System.out.println("Vetor cheio");
        }

        return posicao + 1;
    }

    public static void main(String[] args) {
        new Uni6Exe10B();

    }
}
