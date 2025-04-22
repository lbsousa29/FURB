import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entradas
        int n = 4;
        String nomeM = "";
        double precoDeCompra = 0;
        double precoDeVenda = 0;
        double lucro = 0;
        String lucro10 = "";
        String lucro20 = "";
        String lucroM20 = "";
        // Processos
        for (int i = 1; i <= n; i++) {
            System.out.println("Incira o nome do produto: ");
            nomeM = teclado.next();
            System.out.println("Qual o valor de compra do produto? ");
            precoDeCompra = teclado.nextDouble();
            System.out.println("Qual o valor de venda deste produto? ");
            precoDeVenda = teclado.nextDouble();
            // calculos
            lucro = (precoDeVenda - precoDeCompra) / precoDeCompra * 100;
            if (lucro < 10.0) {
                lucro10 = lucro10.concat(nomeM + " ");
            } else if (lucro >= 10.0 && lucro <= 20.0) {
                lucro20 = lucro20.concat(nomeM + " ");
            } else if (lucro >= 20.0) {
                lucroM20 = lucroM20.concat(nomeM + " ");
            }
        }
        System.out.println("Estes produtos tem menos de 10% de Lucro: " + lucro10);
        System.out.println("Estes produtos tem ente 10 e 20% de Lucro: " + lucro20);
        System.out.println("Estes produtos tem mais de 20% de Lucro: " + lucroM20);
        teclado.close();
    }

}
