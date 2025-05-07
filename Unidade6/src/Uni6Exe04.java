import java.util.Scanner;

public class Uni6Exe04 {
   
    private Uni6Exe04(){
       Scanner teclado = new Scanner(System.in);
       final int tamanhoVetor = 10;
       int vetor1[] = new int[tamanhoVetor];
       int vetor2[] = new int[tamanhoVetor];
       int vetor3[] = new int[tamanhoVetor];

       lerVetor(vetor1,teclado, "Vetor1");
       lerVetor(vetor2, teclado,"Vetor2");
       somaVetor(vetor1, vetor2, vetor3);
       imprimirVetor(vetor1, "Vetor1");
       imprimirVetor(vetor2, "Vetor2");
       imprimirVetor(vetor3, "Vetor3");


       teclado.close();
    }

    private void lerVetor(int vetor[], Scanner tec, String nomeVetor){
        System.out.println("****** Lendo o "+nomeVetor+ " ******");
        for(int i = 0; i < vetor.length;i++){
            System.out.print(nomeVetor+"["+i+"]: ");
            vetor[i] = tec.nextInt();
        }
    }

    private void somaVetor(int vet1[], int vet2[], int vet3[]){
        for (int i = 0; i < vet3.length; i++){
            vet3[i] = vet1[i] + vet2[i];
        }
    }

    private void imprimirVetor(int vetor[], String nomeVetor){
        System.out.println("***** IMPRIMINDO "+nomeVetor+" ******");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(nomeVetor+"["+i+"]: "+vetor[i]);
        }
    } 
   
    public static void main(String[] args) {
        new Uni6Exe04();
    } 
}