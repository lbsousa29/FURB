import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        //entrada
        double vDivisor =0;
        double vDividendo = 0;
        double valorS =0;
        //processos
        for(int i = 1; i <= 20 ; i++){
            vDividendo = 1 + (2* i);
            vDivisor += (i * 2);
            valorS += vDividendo/vDivisor;
        }
        System.out.println("O valor de S é: "+valorS );
        teclado.close();
    }
}
