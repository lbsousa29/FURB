import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o número da inscrição do atleta: ");
        int inscricaoAtleta = teclado.nextInt();

        System.out.println("insira a altura do atleta: ");
        double alturaAtleta = teclado.nextDouble();

        double somaAlturas = alturaAtleta;
        double contador = 1;

        double maiorAltura = alturaAtleta;
        double menorAltura = alturaAtleta;

        int inscricaoMaior = inscricaoAtleta;
        int inscricaoMenor = inscricaoAtleta;

    
        while (inscricaoAtleta != 0) {
            System.out.println("Informe o número de inscrição do atleta: ");
            inscricaoAtleta = teclado.nextInt();

            if (inscricaoAtleta != 0) {
                  System.out.println("Informe a altura do atleta: ");
                alturaAtleta = teclado.nextDouble();

                  somaAlturas += alturaAtleta;
                contador++;

                if (alturaAtleta > maiorAltura) {
                    maiorAltura = alturaAtleta;
                    inscricaoMaior = inscricaoAtleta;
                }

                if (alturaAtleta < menorAltura && alturaAtleta != 0 && inscricaoMenor != 0) {
                    menorAltura = alturaAtleta;
                    inscricaoMenor = inscricaoAtleta;
                }
            }
        }

        double media = somaAlturas / contador;

        System.out.println("O N° de inscrião do atleta mais alto é " + inscricaoMaior);
        System.out.println("O N° de inscrião do atleta mais baixo é " + inscricaoMenor);
        System.out.println("A média de altura do grupo de atletas é " + media + "m");

        teclado.close();
    }
}
