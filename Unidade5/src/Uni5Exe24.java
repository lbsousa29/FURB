import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o limite diário em Kg: ");
        double limite = teclado.nextDouble();

        limite = limite * 1000;

        double pesoP = 0;

        int peixe = 1;

        char resposta = 's';

        while (resposta != 'n' && limite > pesoP){
            
            System.out.println("Informe o peso do " + peixe + "º peixe (em gramas): ");
            pesoP += teclado.nextDouble();

            peixe++;

            System.out.println("Peso total: " + pesoP + "g");

            System.out.println("Gostaria de inserir o peso de mais um peixe? (s/n)");
            resposta = teclado.next().charAt(0);
            resposta = Character.toLowerCase(resposta);

        }

        if (limite <= pesoP){
            System.out.println("Limite diário atingido");
        }


        teclado.close();
    }
}
