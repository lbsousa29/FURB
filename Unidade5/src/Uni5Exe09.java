import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        //Entrada
        System.out.println("Insira a quantidade de alunos e da turma: ");
        int nAlunos = teclado.nextInt();
        int idade =0;
        String dz8a ="";
        int vinteA =0;
        String nome = "";
        //Processos
        for(int i = 1; i <= nAlunos; i++ ){
            System.out.println("Insira o nome do aluno: ");
            nome = teclado.next();
            System.out.println("Insira a ideade do aluno:");
            idade = teclado.nextInt();
            if(idade == 18){
                dz8a = dz8a.concat(nome + " ");
            }
            if(idade >= 20){
                vinteA++;
            }
        }
        System.out.println("Lista de alunos com 18 anos: "+dz8a);
        System.out.println("A soma dos jovens é de: "+vinteA);
    teclado.close();
    }

    
}
