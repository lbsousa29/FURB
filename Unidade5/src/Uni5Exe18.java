import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o canal (4, 5, 9, 12)");
        int canal = teclado.nextInt();
        int qtdPessoas = 0;
        int qtdCanal4 = 0, qtdCanal5 = 0, 
            qtdCanal9 = 0, qtdCanal12 = 0,
            totalPessoas = 0;

        while(canal != 0){
            System.out.println("Informe a quantidade de pessoas:");
            qtdPessoas = teclado.nextInt();
            
            totalPessoas += qtdPessoas;

            switch (canal) {
                case 4:
                    qtdCanal4 += qtdPessoas;
                    break;
                case 5:
                    qtdCanal5 += qtdPessoas;
                    break;
                case 9:
                    qtdCanal9 += qtdPessoas;
                    break;
                case 12:
                    qtdCanal12 += qtdPessoas;
                    break;
            }            

            System.out.println("Informe o canal (4, 5, 9, 12)");
            canal = teclado.nextInt();
        }

        double percentualCanal4 = (qtdCanal4 * 100)/totalPessoas;
        double percentualCanal5 = (qtdCanal5 * 100)/totalPessoas;
        double percentualCanal9 = (qtdCanal9 * 100)/totalPessoas;
        double percentualCanal12 = (qtdCanal12 * 100)/totalPessoas;

        System.out.println("Percentual audiência por canal:");
        System.out.println("Canal4: "+percentualCanal4+" %");
        System.out.println("Canal5: "+percentualCanal5+" %");
        System.out.println("Canal9: "+percentualCanal9+" %");
        System.out.println("Canal12: "+percentualCanal12+" %");



        teclado.close();

    }
}