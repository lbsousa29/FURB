import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor máximo de pedágio: ");
        double max = teclado.nextDouble();

        double valorPedagio = 0;
        double distancia = 0;

        int qtdeAcima = 0;
        int totalTrechos = 0;
        int maior150 = 0;

        while (valorPedagio >= 0) {
            System.out.println("Informe o custo do pedágio: ");
            valorPedagio = teclado.nextDouble();

            if (valorPedagio >= 0) {
                System.out.println("Informe a distância (em Km): ");
                distancia = teclado.nextDouble();

                totalTrechos++;

                if (valorPedagio > max) {
                    qtdeAcima++;
                }

                if (valorPedagio < max && distancia > 150) {
                    maior150++;
                }
            }
        }

        System.out.println(qtdeAcima + " trechos com valor acima do qual ele nega-se a pagar");
        System.out.println(totalTrechos + " trechos informados");
        System.out.println(maior150 + " trechos acima de 150km com valor aceito por ele");

        teclado.close();
    }
}
