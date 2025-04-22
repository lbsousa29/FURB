import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o dia da semana(p):");
        int diaMes = teclado.nextInt();
        int espacosVazioAntes = diaMes-1;
        System.out.println("Informe a quantidade de dias no mês(n):");
        int qtdDiasMes = teclado.nextInt();

        int linha = 1, coluna = 1;
        int qtdDiasSemana = 7;
        int diaMesAtual = 1;

        int qtdLinhas = ((espacosVazioAntes+qtdDiasMes)/qtdDiasSemana);
        if (((espacosVazioAntes+qtdDiasMes) %qtdDiasSemana) > 0){
            qtdLinhas++;
        }
        System.out.println("-----------------------------");
        System.out.println("| D | S | T | Q | Q | S | S |");
        System.out.println("-----------------------------");
        while(linha <= qtdLinhas){//linhas
            coluna = 1;
            while(coluna <=  qtdDiasSemana){//colunas
                if (espacosVazioAntes > 0){
                    System.out.print("|   ");
                    espacosVazioAntes--;
                }else{
                     if (diaMesAtual <= qtdDiasMes){
                        if (diaMesAtual <= 9){
                            System.out.print("|  "+diaMesAtual);
                        }else{
                            System.out.print("| "+diaMesAtual);
                        }
                        
                     }else{
                        System.out.print("|   ");
                     }   
                    
                    diaMesAtual++;
                }

               coluna++; 
                
            }
            System.out.print("|");
            System.out.println();
            System.out.print("-----------------------------");
            System.out.println();
            linha++;

        }

        teclado.close();

    }
}