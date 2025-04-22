import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //entradas
        int numero = 0;

        for(int contador =1; contador <=20; contador++){
            System.out.println("Informe o "+contador+"°:");
            numero = teclado.nextInt();
            if(numero % 2 == 0 ){
                System.out.println("O número é PAR");
            }else{
                System.out.println("O número é IMAPR");
            }
        }
     teclado.close();   
    }
}