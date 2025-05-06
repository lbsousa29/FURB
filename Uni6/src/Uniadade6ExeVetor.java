public class Uniadade6ExeVetor {
    public static void main(String[] args) {
        new Uniadade6ExeVetor();

    }

    private int numeros[] = new int[6]; //melhor forma de declarar vetor 

    private Uniadade6ExeVetor() {

        getValores();
        imprimirValores();
        randomizarValores();
        imprimirValores();

    }

    private void randomizarValores() {
        // Da um numero aleatorio
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100f);
        }
    }

    private void imprimirValores() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + " = " + numeros[i]);
        }
    }

    private void getValores() {
        numeros[0] = 3;
        numeros[1] = 54;
        numeros[2] = 12;
        numeros[3] = 20;
        numeros[4] = 15;
        numeros[5] = 16;
    }
}
