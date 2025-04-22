import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int voto = 0;

        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int votosNulo = 0;
        int votosBranco = 0;

        do {
            System.out.println("Informe seu voto: ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                default:
                    System.out.println("Opção Incorreta");
            }
        } while (voto != 0);

        double totalVotos = (double) (votos1 + votos2 + votos3 + votos4 + votosNulo + votosBranco);
        double percentualNulo = votosNulo * 100 / totalVotos;
        double percentualBranco = votosBranco * 100 / totalVotos;

        System.out.println("Candidato 1: " + votos1 + " votos");
        System.out.println("Candidato 2: " + votos2 + " votos");
        System.out.println("Candidato 3: " + votos3 + " votos");
        System.out.println("Candidato 4: " + votos4 + " votos");
        System.out.println("Votos Nulos: " + votosNulo + " votos");
        System.out.println("Votos em Branco: " + votosBranco + " votos");

        System.out.println("Percentual de votos nulos: " + df.format(percentualNulo) + "%");
        System.out.println("Percentual de votos em branco: " + df.format(percentualBranco) + "%");

        teclado.close();
    }
}
