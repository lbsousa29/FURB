import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        //entrada
        int vp =0;
        int vi =0;
        //processos
        for(int i = 1; i <= 100;i ++){
           if(i % 2 ==0 ){//par
            vp += i;
           }else{
            vi += i;
           }

        }
        System.out.println("Soma dos números pares: "+vp);
        System.out.println("Soma dos números impares: "+vi);
        teclado.close();
    }

    
}
