package Question1;

public class App02 {
	public static void incrementarInteiro(int inteiro) {
        inteiro += 10;
        System.out.println("Dentro da função: inteiro = " + inteiro);
    }

    public static void main(String[] args) {
        int numero = 20;

        System.out.println("Antes da função: numero = " + numero);

        incrementarInteiro(numero);

        System.out.println("Depois da função: numero = " + numero);
    }
}
