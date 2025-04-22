import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int d = 0;
        int e = 0;

        while (true){
            System.out.println("Insira o ganhador da rodada: ");
            char ganhador_Rodada = teclado.next().charAt(0);
            ganhador_Rodada = Character.toLowerCase(ganhador_Rodada);

            if (ganhador_Rodada == 'd'){
                d++;
            }

            if (ganhador_Rodada == 'e'){
                e++;
            }

            if (e >= 21 && e - d >= 2){
                System.out.println("O vencedor é o jogador da Esquerda!");
                break;
            }

            if (d >= 21 && d - e >= 2){
                System.out.println("O vencedor é o jogador da direita!");
                break;
            }
        }

        teclado.close();
    }
}
