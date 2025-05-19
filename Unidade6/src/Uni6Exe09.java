import java.util.Scanner;

public class Uni6Exe09 {
    public static void ler(Scanner scanner){
        int soma = 0, somaHomens = 0, qtdHomens = 0, notaMulherJovem = 0, mulherJovem = 0, qtdMulher50 = 0;
        int[] notasMulher50 = new int[30];
        boolean primeiraMulher = true;

        for (int i = 0;i < 30;i++){
            System.out.print("Sexo: ");
            int sexo = scanner.nextInt();
            System.out.print("Nota: ");
            int nota = scanner.nextInt();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            soma += nota;

            if (sexo == 2){
                somaHomens += nota;
                qtdHomens++;
            }else{
                if (primeiraMulher){
                    notaMulherJovem = nota;
                    mulherJovem = idade;
                    primeiraMulher = false;
                }

                if (idade < mulherJovem){
                    mulherJovem = idade;
                    notaMulherJovem = nota;
                }

                if (idade >= 50){
                    notasMulher50[qtdMulher50] = nota;
                    qtdMulher50++;
                }
            }

        }
        
        float media = soma / 30.0f;
        float mediaHomem = somaHomens / qtdHomens;
        System.out.println("Media: " + media);
        System.out.println("Media masculina: " + mediaHomem);
        System.out.println("Nota mulher mais jovem: " + notaMulherJovem);

        mulher_50_acima_media(notasMulher50, qtdMulher50, media);
    }

    public static void mulher_50_acima_media(int[] vetor, int qtd, float media){
        int cont = 0;
        for (int i = 0;i < qtd;i++){
            if (vetor[i] > media){
                cont++;
            }
        }

        System.out.println("Quantidade de mulheres 50+ anos com nota acima media: " + cont);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ler(scanner);
    }
}
