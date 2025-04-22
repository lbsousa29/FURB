import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int resposta = 1;

        double valorTotal = 0;

        int dia = 0;
        int pecas_Manha = 0;
        int pecas_Tarde = 0;
        int soma = pecas_Manha + pecas_Tarde;
        int maior_Producao = soma;
        int diaMaior_Producao = 0;

        while (resposta != 2) {

            System.out.println("Informe o dia de abril: ");
            dia = teclado.nextInt();

            System.out.println("Informe o total de peças produzidas de manhã:");
            pecas_Manha = teclado.nextInt();

            System.out.println("Informe o total de peças poduzidas de tarde: ");
            pecas_Tarde = teclado.nextInt();

            soma = pecas_Manha + pecas_Tarde;

            if (soma >= maior_Producao) {
                maior_Producao = soma;
                diaMaior_Producao = dia;
            }

            if (dia > 0 && dia < 31) {
                if (dia >= 1 && dia <= 15) {
                    if (pecas_Manha + pecas_Tarde > 100 && pecas_Manha > 30 && pecas_Tarde > 30) {
                        valorTotal = (pecas_Manha + pecas_Tarde) * 0.8;
                    } else {
                        valorTotal = (pecas_Manha + pecas_Tarde) * 0.5;
                    }
                } else {
                    valorTotal = (pecas_Manha * 0.4) + (pecas_Tarde * 0.3);
                }
            } else {
                System.out.println("Dia inválido");
            }

            System.out.printf("Valor recebido: R$%.2f", valorTotal);
            
            if (pecas_Manha > pecas_Tarde) {
                System.out.println("\nO funcionário produz mais de manhã: "+ pecas_Manha + " peças");
            }else if (pecas_Manha < pecas_Tarde){
                System.out.println("\nO funcionário produz mais de tarde: " + pecas_Tarde + " peças");
            }

            System.out.println("Novo funcionário (1.sim 2.não)");
            resposta = teclado.nextInt();

        }

        System.out.println("O dia com a maior produção foi " + diaMaior_Producao + " de abril" );

        teclado.close();
    }
}