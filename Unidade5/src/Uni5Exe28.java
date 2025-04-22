import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char resposta = 's';
        int votos_1 = 0;
        int votos_2 = 0;
        int votos_3 = 0;
        int votos_4 = 0;

        int totalVotos = 0;

        while (resposta != 'n') {
            System.out.println("Qual é o melhor conjunto do ano? ");
            System.out.println("1-Nenhum de nós");
            System.out.println("2-CPM22");
            System.out.println("3-Skank");
            System.out.println("4-Jota Quest");

            int grupo = teclado.nextInt();

            totalVotos++;

            switch (grupo) {
                case 1:
                    votos_1++;
                    break;
                case 2:
                    votos_2++;
                    break;
                case 3:
                    votos_3++;
                    break;
                case 4:
                    votos_4++;
                    break;
                default:
                    System.out.println("Grupo inválido");
            }

            System.out.println("Mais um voto? (s/n)");
            resposta = teclado.next().charAt(0);
            resposta = Character.toLowerCase(resposta);
        }


        System.out.println("\nNenhum de Nós: " + votos_1 + " votos.");
        System.out.println("CPM22: " + votos_2 + " votos.");
        System.out.println("Skank: " + votos_3 + " votos.");
        System.out.println("Jota Quest: " + votos_4 + " votos.");

        System.out.println("\nNenhum de Nós: " + votos_1 * 100 / totalVotos + "%");
        System.out.println("CPM22: " + votos_2 * 100 / totalVotos+ "%");
        System.out.println("Skank: " + votos_3 * 100 / totalVotos+ "%");
        System.out.println("Jota Quest: " + votos_4 * 100 / totalVotos + "%");

        if (votos_1 > votos_2 && votos_1 > votos_3 && votos_1 > votos_4){

            System.out.println("\nA banda vencedora é Nenhum de Nós!!!");

        }else if (votos_2 > votos_1 && votos_2 > votos_3 && votos_2 > votos_4){
            System.out.println("\nA banda vencedora é CPM22!!! ");
        }else if (votos_3 > votos_1 && votos_3 > votos_2 && votos_3 > votos_4){
            System.out.println("\nA banda vencedora é Skank!!!");
        }else {
            System.out.println("\nA banda vencedora é Jota Quest!!!");
        }

        teclado.close();
    }
}
