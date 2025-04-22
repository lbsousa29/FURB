import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada
        int par = 0;
        int impar = 0;
        // processos
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {// par
                par += i;
            } else {
                impar += i;
            }

        }
        System.out.println("Soma dos números pares: " + par);
        System.out.println("Soma dos números impares: " + impar);
        teclado.close();
    }

}
