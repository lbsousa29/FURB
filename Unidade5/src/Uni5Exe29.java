import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = teclado.nextInt();


        while (valor != 0){
            if (valor / 20 >= 1){
                int cedulas20 = valor / 20;
                System.out.println("Cédulas de R$20,00: " + cedulas20);
                valor -= (cedulas20 * 20);
            }else if (valor / 10 >= 1){
                int cedulas10 = valor / 10;
                System.out.println("Cédulas de R$10,00: " + cedulas10);
                valor -= (cedulas10 * 10);
            }else if (valor / 5 >= 1){
                int cedulas5 = valor / 5;
                System.out.println("Cédulas de R$5,00: " + cedulas5);
                valor -= (cedulas5 * 5);
            }else if (valor / 2 >= 1){
                int cedulas2 = valor / 2;
                System.out.println("Cédulas de R$2,00: " + cedulas2);
                valor -= (cedulas2 * 2);
            }else {
                int cedulas1 = valor;
                System.out.println("Cédulas de R$1,00: " + cedulas1);
                valor -= cedulas1;
            }
        }


        teclado.close();
    }
}
