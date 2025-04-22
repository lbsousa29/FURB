import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, numeroDiarias = 0, numeroContasEncerradas = 0;
        String nome = "";
        double valorPagar = 0;
        do{
            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.out.println("(3) sair.");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                        numeroContasEncerradas++;

                        System.out.println("*** Encerrar Conta ***");
                        System.out.print("Nome: ");
                        nome = teclado.next();
                        System.out.print("Número Diárias:");
                        numeroDiarias = teclado.nextInt();

                        valorPagar = 50.00 * numeroDiarias;
                        if (numeroDiarias < 15){
                            valorPagar += 7.50 * numeroDiarias;
                        }else if (numeroDiarias == 15){
                            valorPagar += 6.50 * numeroDiarias;
                        }else{
                            valorPagar += 5.0 * numeroDiarias;
                        }
                        System.out.println(" ******* Recibo ******");
                        System.out.println(" Nome: "+nome+ " Valor a Pagar: R$ "+valorPagar);



                    break;
                case 2:
                    System.out.println("Número de contas encerradas: "+numeroContasEncerradas);    
                    break;
                case 3:
                        System.out.println("Sistema Finalizado");
                    break;
            
                default:
                        System.out.println("Opção Inválida!");
                    break;
            }


        }while(opcao != 3);

        teclado.close();
    }
}