import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double precoFinal = 0.00;
        double valorDesconto = 0.0;

        System.out.println("Escolha a forma de pagamento");
        System.out.println("1 - DÉBITO");
        System.out.println("2 - PIX");
        System.out.println("3 - CREDIÁRIO");
        System.out.println("4 - Informações sobre o pagamento da fatura no crediário:");
        int opcao = read.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor da compra:");
                double precoDacompra = read.nextDouble();
                System.out.println("R$" + precoDacompra);
                break;
            case 2:
                System.out.println("Digite o valor da compra:");
                double valor1Compra = read.nextDouble();
                valorDesconto = valor1Compra * 3 / 100;
                precoFinal = valor1Compra - valorDesconto;
                System.out.println("O valor com desconto ficou R$" + precoFinal);

                break;
            case 3:
                System.out.println("Digite o valor da compra:");
                double valorCompra = read.nextDouble();
                System.out.println("Digite quantas vezes deseja parcelar:");
                int nmrDeParcelas = read.nextInt();
                System.out.println("Escolha a data de vencimento");
                int dataVencimento = read.nextInt();
                precoFinal = valorCompra / nmrDeParcelas;
                System.out.println("R$" + precoFinal + " Por mês" + " Com o vencimento no dia " + dataVencimento);

                break;
            case 4:
                System.out.println("Informe o dia do vencimento: ");
                int diaVencimento = read.nextInt();
                System.out.println("Informe o dia do pagamento: ");
                int diaPagamento = read.nextInt();
                System.out.println("Informe o valor da prestação: ");
                double valorPrestacao = read.nextDouble();
                double valorAPagar = 0.0;
                if (diaPagamento <= diaVencimento) {
                    valorAPagar = valorPrestacao * 0.9;
                    System.out.println("Pagamento em dia.");
                } else if (diaPagamento <= diaVencimento + 5) {
                    valorAPagar = valorPrestacao;
                    System.out.println("Pagamento atrasado, mas dentro do prazo de 5 dias.");
                } else {
                    int diasAtraso = diaPagamento - (diaVencimento);
                    valorAPagar = valorPrestacao + (valorPrestacao * 0.02 * diasAtraso);
                    System.out.println("Pagamento atrasado. Multa de 2% por dia de atraso.");
                }
                System.out.printf("Valor a ser pago: R$ %.2f\n", valorAPagar);
                break;
            default:
                break;

        }

        read.close();

    }
}
