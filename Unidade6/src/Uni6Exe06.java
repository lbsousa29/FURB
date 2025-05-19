import java.util.Scanner;

public class Uni6Exe06 {
    public static float[] ler(Scanner scanner){
        int n = scanner.nextInt();

        float[] vetor = new float[n];

        for (int i = 0;i < n;i++){
            vetor[i] = scanner.nextFloat();
        }

        return vetor;
    }

    public static boolean verificar(float[] vetor, float valor){
        for (int i = 0;i < vetor.length;i++){
            if (vetor[i] == valor){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] vetor = ler(scanner);
        float valor = scanner.nextFloat();
        boolean retorno = verificar(vetor, valor);
        if (retorno){
            System.out.println("Valor encontrado");
        }else{
            System.out.println("Valor não encontrado");
        }

        scanner.close();
    }
}
