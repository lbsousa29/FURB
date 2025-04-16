import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o peso:");
        double peso = read.nextDouble();
        System.out.println("Digite a altura:");
        double altura = read.nextDouble();
        if (altura <= 1.00 & peso <= 50) {
            System.out.println("Subnutrido");
            System.out.println("Perigo de Vida");
        } else if (altura > 5.00) {
            System.out.println("Pegar medidas novamente");
        } else {
            System.out.println("Erro peso");
        }
        System.out.println("fim");
        read.close();
    }
}
