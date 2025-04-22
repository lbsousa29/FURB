import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo de início: ");
        int n = teclado.nextInt();

        System.out.println("Insira o número inteiro positivo de decremento: ");
        int k = teclado.nextInt();

        System.out.println("Insira o tamanho da mochila: ");
        double m = teclado.nextDouble();

        int soma_Dentro = 0;
        int soma_Fora = 0;

        System.out.println("Elementos a serem colocados na mochila: ");
        String elementosFora = "Elementos que ficaram de fora: ";

        while (n > 0){
            if (n <= m){
                System.out.print(n + " ");
                soma_Dentro += n;
                m -= n;
            }else {
                elementosFora = elementosFora.concat(n + " ");
                soma_Fora += n;
            }

            n -= k;
        }
      
        System.out.println("\n" + elementosFora);
        System.out.println("Soma dos elementos que entraram é " + soma_Dentro);
        System.out.println("Soma dos elementos que não entraram é " + soma_Fora);

        teclado.close();
    }
}
