import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char respo = 's';

        while (respo != 'n'){

            System.out.println("Insira o nome do vendedor: ");
            String nome = teclado.next();

            System.out.println("Insira a quantidade de produtos vendidos: ");
            int n = teclado.nextInt();

            double totalVendas = 0;

            for (int i = 1; i <= n; i++){
                System.out.println("Insira o preço unitário do "+ i + "º produto");
                double precoUnitario = teclado.nextDouble();

                System.out.println("Insira a quantidade vendida: ");
                int qtdeVendida = teclado.nextInt();

                totalVendas += (precoUnitario * qtdeVendida);

            }

            double salario = totalVendas * 0.3;

            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$%.2f\n", totalVendas);
            System.out.printf("Salário: R$%.2f\n" , salario);

            System.out.println("Deseja digitar os dados de outro vendedor vendedor? (s/n)");
            respo = teclado.next().charAt(0);
            respo = Character.toLowerCase(respo);

        }

        teclado.close();
    }
}
