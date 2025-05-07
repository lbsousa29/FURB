import java.util.Scanner;

public class Uni6Exe01 {
    //contrutor
    private Uni6Exe01(){
        Scanner teclado = new Scanner(System.in);

        int vetorNumeros[] = new int[10];

        lerVetor(vetorNumeros, teclado);
        escreverVetor(vetorNumeros);

        teclado.close();
    }

    private void lerVetor(int vet[], Scanner tec){
        for (int i = 0; i < vet.length; i++){
            System.out.print("Informe um número para o indice "+i+
                             " do vetor: ");
            vet[i] = tec.nextInt();
        }

    }

    private void escreverVetor(int vetor[]){
        for (int i = vetor.length-1; i >= 0;i--){
            System.out.println("Vetor["+i+"] : "+vetor[i]);
        }
    }


    public static void main(String[] args) {
        new Uni6Exe01();
    }

}