import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        //entrada
        double somaTermos = 0;

        //processos
        for(int i = 1; i <= 100; i++ ){
            somaTermos += 1/(double)i;

        }
        System.out.println("A soma dos termos é: "+somaTermos);

        teclado.close();
    }
    
}
