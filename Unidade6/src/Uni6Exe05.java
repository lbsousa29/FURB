import java.util.Scanner;

public class Uni6Exe05 {
    public static String[] ler(Scanner scanner){
        String[] vetor_perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"};
        String[] vetor = new String[5];

        for (int i = 0;i < 5;i++){
            System.out.print(vetor_perguntas[i] + " [SIM/NAO/IND]: ");
            vetor[i] = scanner.next();
        }

        return vetor;
    }

    public static int calcular_afinidade(String[] vetor_rapaz, String[] vetor_moca){
        int afinidade = 0;

        for (int i = 0;i < 5;i++){
            if (vetor_rapaz[i].equals(vetor_moca[i])){
                afinidade += 3;
            }else if (vetor_moca[i].equals("IND") || vetor_rapaz[i].equals("IND")){
                afinidade += 1;
            }else{
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------RAPAZ----------");
        String[] vetor_rapaz = ler(scanner);
        System.out.println("----------MOÇA----------");
        String[] vetor_moca = ler(scanner);
        int afinidade = calcular_afinidade(vetor_rapaz, vetor_moca);

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
