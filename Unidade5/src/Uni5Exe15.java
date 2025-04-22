import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nome = teclado.next();
        double nota1 = 0, nota2 = 0, media = 0;

        while(!nome.equals("fim")){
            System.out.println("Informe a nota1:");
            nota1 = teclado.nextDouble();
            System.out.println("Informe a nota2:");
            nota2 = teclado.nextDouble();

            media = (nota1+nota2)/2;

            System.out.println("A média do aluno "+nome+" é "+media);

            System.out.print("Informe o nome do aluno:");
            nome = teclado.next();
        }


        teclado.close();

    }
}