import java.util.Scanner;

public class Uni6Exe02 {
    private Uni6Exe02(){
        Scanner teclado = new Scanner(System.in);
        
        final int tamanhoVetor = 12;

        double vetValores[] = new double[tamanhoVetor];

        ler(vetValores, teclado);
        double mediaFinal = calculaMedia(vetValores);
        imprimirValoresAcimaMedia(vetValores, mediaFinal);

        teclado.close();
    }

    private void ler(double vet[], Scanner tec){
        for (int i = 0; i < vet.length; i++){
            System.out.println("Informe o "+(i+1)+
                               "º número Real: ");
            vet[i] = tec.nextDouble();
        }
    }

    private double calculaMedia(double vetor[]){
        double somaValores = 0;
        for (int indice = 0; indice < vetor.length; indice++){
            somaValores += vetor[indice];
        }
        double media = somaValores/vetor.length;
        return media;
    }

    private void imprimirValoresAcimaMedia(double vetor[], double media){
        System.out.println("******** Média Calculada ****");
        System.out.println(media);
        System.out.println("******** Valores Acima da Média ****");
        
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > media){
                System.out.println("vetor["+i+"] = "+vetor[i]);    
            }
        }
    }


    public static void main(String[] args) {
        new Uni6Exe02();
    }
    

}