import java.util.Scanner;

public class Uni6Exe07 {
    public static int[] ler(Scanner scanner){
        int qtdAdd = 0;
        int n = scanner.nextInt();
        while (n > 20){
            System.out.println("Tamanho do vetor deve ser <= 20");
            n = scanner.nextInt();
        }

        int[] vetor = new int[n];

        for (int i = 0;i < n;i++){
            boolean preenchido = false;
            
            while (!preenchido){
                boolean existe = false;
                int valor = scanner.nextInt();
                for (int j = 0;j < qtdAdd;j++){
                    if (valor == vetor[j]){
                        existe = true;
                        break;
                    }
                }
                if (!existe){
                    preenchido = true;
                    vetor[i] = valor;
                }
            }
        }

        return vetor;
    }

    public static int[] ordenar(int[] vetor, int tam){
        if (tam < 1){
            return vetor;
        }

        for (int i = 0;i < vetor.length - 1;i++){
            if (vetor[i] > vetor[i + 1]){
                int aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
            }
        }

        return ordenar(vetor, tam - 1);
    }

    public static void escrever(int[] vetor){
        for (int i = 0;i < vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = ler(scanner);
        escrever(ordenar(vetor, vetor.length));
        scanner.close();
    }
}
