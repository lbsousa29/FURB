import java.util.Scanner;
public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        //Entradas
        double totalMulheres =0;
        //double totalHomens =0;
        double altura =1;
        //double somaGrup =0;
        double totalGrup = 0;
        double alturaAmulher =0;
        double alturaHomens = 0;
        double mediaF =0;
        double mediaGrup =0;
        char gener =' ';
        
        //processos
        while(altura !=0 ){
            System.out.println("Insira seu gênero, sendo: (M) para masculino e (F) para feminino:");
            gener = teclado.next().toUpperCase().charAt(0);
            System.out.println("Insira a sua altura em M: ");
            altura = teclado.nextDouble();
            //calculos
            if(gener == 'F' && altura !=0){
                alturaAmulher += altura;
                totalMulheres ++;
                totalGrup++;

            }
            if(gener == 'M' && altura !=0){
                alturaHomens += altura;
                totalGrup++;
            }    
            
         }
         mediaF = alturaAmulher/totalMulheres;
         mediaGrup = (alturaAmulher + alturaHomens) /totalGrup;
         System.out.println("A média de altura das mulhers é: "+mediaF);
         System.out.println("A média de altura do grupo é: "+mediaGrup);
         teclado.close();
    }
    
}
