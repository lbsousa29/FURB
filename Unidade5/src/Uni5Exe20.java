import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        /*
         * Um determinado material radioativo perde metade 
         * de sua massa a cada 50
         * segundos. Dada a sua massa inicial em Kg,
         *  descreva um algoritmo que determine
         * o tempo necessário para que essa massa se 
         * torne menor que 0,5 gramas. Escreva
         * a massa inicial, a massa final e o tempo.
         */

         Scanner teclado = new Scanner(System.in);
         System.out.println("Informe a massa inicial em (kg):");
         double massaInicial = teclado.nextDouble();
         double massa = massaInicial*1000;
         int tempo = 0;

         while(massa >= 0.5){
            massa /= 2;
            tempo += 50;
         }

         System.out.println("Massa inicial(kg): "+massaInicial);
         System.out.println("Massa final(gramas):"+massa);
         System.out.println("Tempo: "+tempo +" segundos");


         teclado.close();

    }
}