import java.util.Scanner;

public class Uni6Exe05 {
    public static String[] ler(Scanner scanner){
        String[] vetorPerguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"};
        String[] vetor = new String[5];

        for (int i = 0;i < 5;i++){
            System.out.print(vetorPerguntas[i] + " [SIM/NAO/IND]: ");
            vetor[i] = scanner.next();
        }

        return vetor;
    }

    public static int calcular_afinidade(String[] vetorRapaz, String[] vetorMoca){
        int afinidade = 0;

        for (int i = 0;i < 5;i++){
            if (vetorRapaz[i].equals(vetorMoca[i])){
                afinidade += 3;
            }else if (vetorMoca[i].equals("IND") || vetorRapaz[i].equals("IND")){
                afinidade += 1;
            }else{
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--RAPAZ--");
        String[] vetorRapaz = ler(scanner);
        System.out.println("--MOÇA--");
        String[] vetorMoca = ler(scanner);
        int afinidade = calcular_afinidade(vetorRapaz, vetorMoca);

        if (afinidade == -10){
            System.out.println("Vocês se odeiam!");
        }else if (afinidade <= -1){
            System.out.println("Melhor não perder tempo");
        }else if (afinidade <= 4){
            System.out.println("Vale um encontro.");
        }else if (afinidade <= 9){
            System.out.println("Talvez não dê certo :(");
        }else if (afinidade <= 14){
            System.out.println("Vocês têm muita coisa em comum!");
        }else{
            System.out.println("Casem!");
        }

        scanner.close();
    }
}
