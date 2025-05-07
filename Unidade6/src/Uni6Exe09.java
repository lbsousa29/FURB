import java.util.Scanner;

public class Uni6Exe09 {
    public static void ler(Scanner scanner){
        int soma = 0, soma_homens = 0, qtd_homens = 0, nota_mulher_jovem = 0, mulher_jovem = 0, qtd_mulher_50 = 0;
        int[] notas_mulher_50 = new int[30];
        boolean primeira_mulher = true;

        for (int i = 0;i < 30;i++){
            System.out.print("Sexo: ");
            int sexo = scanner.nextInt();
            System.out.print("Nota: ");
            int nota = scanner.nextInt();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            soma += nota;

            if (sexo == 2){
                soma_homens += nota;
                qtd_homens++;
            }else{
                if (primeira_mulher){
                    nota_mulher_jovem = nota;
                    mulher_jovem = idade;
                    primeira_mulher = false;
                }

                if (idade < mulher_jovem){
                    mulher_jovem = idade;
                    nota_mulher_jovem = nota;
                }

                if (idade >= 50){
                    notas_mulher_50[qtd_mulher_50] = nota;
                    qtd_mulher_50++;
                }
            }

        }
        
        float media = soma / 30.0f;
        float media_homem = soma_homens / qtd_homens;
        System.out.println("Media: " + media);
        System.out.println("Media masculina: " + media_homem);
        System.out.println("Nota mulher mais jovem: " + nota_mulher_jovem);

        mulher_50_acima_media(notas_mulher_50, qtd_mulher_50, media);
    }

    public static void mulher_50_acima_media(int[] vetor, int qtd, float media){
        int cont = 0;
        for (int i = 0;i < qtd;i++){
            if (vetor[i] > media){
                cont++;
            }
        }

        System.out.println("Qtd mulheres 50+ anos com nota acima media: " + cont);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ler(scanner);
    }
}
