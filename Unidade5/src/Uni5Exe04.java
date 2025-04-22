import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada
        double Divisor = 0;
        double Dividendo = 0;
        double valorS = 0;
        // processos
        for (int i = 1; i <= 20; i++) {
            Dividendo = 1 + (2 * i);
            Divisor += (i * 2);
            valorS += Dividendo / Divisor;
        }
        System.out.println("O valor de S é: " + valorS);
        teclado.close();
    }
}
