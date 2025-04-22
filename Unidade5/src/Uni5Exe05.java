import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        //entradas
        System.out.println("Insira o valor de N:");
        int n = teclado.nextInt();
        int num1 = 8;
        int num2 = 10;
        System.out.println(num1+"\n"+num2);
        //processos 
        if(n > 2){
            for(int i = 3; i <= n; i++){
                if(i % 2 != 0){
                    num1 = num1 * 2 ;
                    System.out.println(num1);
                }else{
                    num2 = num1 + 2;
                    System.out.println(num2);
                }
                
            }
        }

            teclado.close();  
        }


    }


