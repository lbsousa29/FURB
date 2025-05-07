import java.util.Scanner;

public class Uni6Exe10 {

    public static void inserir(int valor, int[] vetor, int index){
        if (index >= 50){
            System.out.println("POSICAO INVALIDA");
        }else{
            vetor[index] = valor;
        }
    }

    public static int pesquisar(int valor, int[] vetor, int cont){
        for (int i = 0;i < cont;i++){
            if (vetor[i] == valor){
                return i;
            }
        }

        return -1;
    }

    public static void alterar(int valor_atual, int valor_novo, int[] vetor, int cont){
        int index = pesquisar(valor_atual, vetor, cont);
        if (index >= 0){
            inserir(valor_novo, vetor, index);
        }else{
            System.out.println("numero nao encontrado");
        }
    }

    public static void excluir(int valor, int[] vetor, int cont){
        int index = pesquisar(valor, vetor, cont);
        if (index >= 0){
            for (int i = index;i < cont - 1;i++){
                vetor[i] = vetor[i + 1];
            } 
        }else{
            System.out.println("numero nao encontrado");
        }
    }
    public static void listar(int[] vetor, int cont){
        for (int i = 0;i < cont;i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static int[] ordenar(int[] vetor, int cont){
        if (cont < 1){
            return vetor;
        }

        for (int i = 0;i < vetor.length - 1;i++){
            if (vetor[i] > vetor[i + 1]){
                int aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
            }
        }

        return ordenar(vetor, cont - 1);
    }

    public static void inverter(int[] vetor, int cont){
        for (int i = 0;i < cont;i++){
            int aux = vetor[i];
            vetor[i] = vetor[cont - i];
            vetor[cont - i] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int[] vetor = new int[50];
        int cont = 0;

        while(opcao != 8){
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Valor: ");
                    int valor = scanner.nextInt();
                    if (cont == 50){
                        System.out.println("VETOR CHEIO");
                    }else{
                        inserir(valor, vetor, cont);
                        cont++;
                    }
                    break;

                case 2:
                    System.out.print("Valor: ");
                    valor = scanner.nextInt();
                    int index = pesquisar(valor, vetor, cont);
                    if (index >= 0){
                        System.out.println("Existe no vetor");
                    }else{
                        System.out.println("Nao existe no vetor");
                    }
                    break;

                case 3:
                    System.out.print("Valor atual: ");
                    int valor_atual = scanner.nextInt();
                    System.out.print("Valor novo: ");
                    int valor_novo = scanner.nextInt();
                    alterar(valor_atual, valor_novo, vetor, cont);
                    break;    

                case 4:
                    System.out.print("Valor: ");
                    valor = scanner.nextInt();
                    excluir(valor, vetor, cont);
                    cont--;
                    break;

                case 5:
                    listar(vetor, cont);
                    break;

                case 6:
                    ordenar(vetor, cont);
                    break;

                case 7:
                    inverter(vetor, cont);
                    break;

                case 8:
                    System.out.println("SAINDO DO SISTEMA...");
                    break;
            }
        }

        scanner.close();
    }    
}
