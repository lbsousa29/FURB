import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        //Entradas
        System.out.println("Insira o Número de linhas desejadas: ");
        int n = teclado.nextInt();
        int num =0;
        //Processos
        for(int i = 1; i <=n; i++){
            for(int c = 1; c <= i; c++ ){
                if(c < 10){
                    num++;
                    System.out.print(num+" ");
                }
            }
            System.out.println();
        }
        teclado.close();
        }
        
    }
    

