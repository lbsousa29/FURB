import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 20){
            System.out.println("Tamanho do vetor deve ser <= 20");
            n = scanner.nextInt();
        }

        int qtd_dif = 0;
        float[] vetor_original = new float[n];
        float[] vetor_diferentes = new float[n];
        int[] vetor_qtd = new int[n];

        for (int i = 0;i < n;i++){
            float valor = scanner.nextFloat();
            vetor_original[i] = valor;
            boolean existe = false;
            for (int j = 0;j < qtd_dif;j++){
                if (vetor_original[i] == vetor_diferentes[j]){
                    vetor_qtd[j]++;
                    existe = true;
                    break;
                }
            }
            if (!existe){
                vetor_diferentes[qtd_dif] = valor;
                vetor_qtd[qtd_dif] = 1;
                qtd_dif++;
            }
        }

        System.out.println("VALOR | FREQUENCIA");

        for (int i = 0;i < qtd_dif;i++){
            System.out.printf("  %.2f|           %d\n", vetor_diferentes[i], vetor_qtd[i]);
        }

        scanner.close();
    }
}
