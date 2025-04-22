import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo: ");
        int num = teclado.nextInt();

        while (num > 1) {
            if (num % 2 == 0) {
                System.out.print(num);
                System.out.print(" | "+ 2 + "\n");
                num = num / 2;
            } else if (num % 3 == 0) {
                System.out.print(num);
                System.out.print(" | "+ 3+ "\n");
                num = num / 3;
            } else if (num % 5 == 0) {
                System.out.print(num);
                System.out.print(" | " + 5+ "\n");
                num = num / 5; 
            }else if (num % 7 == 0) {
                System.out.print(num);
                System.out.print(" | " + 7+ "\n");
                num = num / 7; 
            }else if (num % 11 == 0) {
                System.out.print(num);
                System.out.print(" | " + 11+ "\n");
                num = num / 11; 
            }else if (num % 13 == 0) {
                System.out.print(num);
                System.out.print(" | " + 13+ "\n");
                num = num / 13; 
            }else if (num % 17 == 0) {
                System.out.print(num);
                System.out.print(" | " + 17+ "\n");
                num = num / 17; 
            }else if (num % 19 == 0) {
                System.out.print(num);
                System.out.print(" | " + 19+ "\n");
                num = num / 19; 
            }else if (num % 23 == 0) {
                System.out.print(num);
                System.out.print(" | " + 23+ "\n");
                num = num / 23; 
            }else if (num % 29 == 0) {
                System.out.print(num);
                System.out.print(" | " + 29+ "\n");
                num = num / 29; 
            }else{
                System.out.print(num);
                System.out.print(" | " + num+ "\n");
                num = num / num;
            }
        }

        System.out.println(num/num);

        teclado.close();
    }
}
