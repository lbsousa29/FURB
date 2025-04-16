import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o tipo da tinta");
        char tipotinta = read.next().toUpperCase().charAt(0);

        String cor = "";

        if (tipotinta == 'A') {
            cor = "Azul";
        } else if (tipotinta == 'V') {
            cor = "Vermelha";
        } else if (tipotinta == 'P') {
            cor = "Preta";
        } else {
            cor = "Tipo Incorreto";
        }

        System.out.println("A cor correspondente é: " + cor);

        read.close();
    }
}
