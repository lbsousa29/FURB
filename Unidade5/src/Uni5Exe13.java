import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe13 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");
      System.out.println("Informe a Quantidade de paradas:");
      int paradas = teclado.nextInt();
      double km = 0, km_litro = 0;
      int litros = 0;
      double soma_Km = 0, soma_litros = 0;

      for (int contador = 1; contador <= paradas; contador++) {
         System.out.println("Informe a KM: ");
         km = teclado.nextDouble();
         soma_Km += km;

         System.out.println("Informe os litros abastecidos:");
         litros = teclado.nextInt();
         soma_litros += litros;

         km_litro = km / litros;

         System.out.println(contador + "ª parada - " +
               "A quilometragem obtida por " +
               "litro de combustível foi: " + km_litro);
      }
      double media_km = soma_Km / soma_litros;
      System.out.println("A quilometragem média obtida por litro " +
            "de combustível em toda a viagem: " + df.format(media_km));

      teclado.close();
   }
}