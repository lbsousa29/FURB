import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 20){
            System.out.println("Tamanho do vetor deve ser <= 20");
            n = scanner.nextInt();
        }

        int qtdDif = 0;
        float[] vetorOriginal = new float[n];
        float[] vetorDiferentes = new float[n];
        int[] vetorQtd = new int[n];

        for (int i = 0;i < n;i++){
            float valor = scanner.nextFloat();
            vetorOriginal[i] = valor;
            boolean existe = false;
            for (int j = 0;j < qtdDif;j++){
                if (vetorOriginal[i] == vetorDiferentes[j]){
                    vetorQtd[j]++;
                    existe = true;
                    break;
                }
            }
            if (!existe){
                vetorDiferentes[qtdDif] = valor;
                vetorQtd[qtdDif] = 1;
                qtdDif++;
            }
        }

        System.out.println("VALOR | FREQUÊNCIA");

        for (int i = 0;i < qtdDif;i++){
            System.out.printf("  %.2f|           %d\n", vetorDiferentes[i], vetorQtd[i]);
        }

        scanner.close();
    }
}
