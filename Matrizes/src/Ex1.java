public class Ex1 {
    public static void main(String[] args) throws Exception {
        // Matriz
        int matriz[][] = new int[3][3];
        // Prenchendo-a e tabuleiro
        System.out.println("Imprimindo como tabuleiro");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();//quebra de linha
            
        }
        
    }
}

