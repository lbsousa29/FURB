import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        //Entradas
        System.out.println("Quantas vezes os o processo re repetirá:");
        int nVezes =teclado.nextInt();
        double menorN = Double.MAX_VALUE;
        double m = 0;
        int vezes = 0;
           
        //Processos
            for(int i = 1; i <= nVezes; i++ ){
                System.out.println("Insira um número:");
               Double n = teclado.nextDouble();
               if(n < 0 && n < menorN){
                menorN = n ;
               }
               if(n > 0){
                m = m + n;
                vezes ++;
               }
             }
            System.out.println("O menor número é:"+menorN);
            System.out.println("A média é: "+m/vezes);
            teclado.close();
        }
    
}
