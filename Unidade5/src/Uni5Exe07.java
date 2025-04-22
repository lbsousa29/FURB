import java.util.Scanner;

public class Uni5Exe07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe um número inteiro n :");
    int n = teclado.nextInt();
    double numero = 0, menorNumero = 0, maiorNumero = 0;
    for (int contador = 1; contador <= n;contador++){
        System.out.print("Informe o "+contador+"º número Real:");
        numero = teclado.nextDouble();
        
        if (contador == 1){
            menorNumero = numero;
            maiorNumero = numero;
        }else{
            if (numero < menorNumero){
                menorNumero = numero;
            }

            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }

        
    }

    System.out.println("O maior número é: "+maiorNumero);
    System.out.println("O menor número é: "+menorNumero);

    teclado.close();

  }  
}