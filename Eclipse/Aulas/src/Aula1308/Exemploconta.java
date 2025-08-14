package Aula1308;

public class Exemploconta {
	String titular;
	double saldo;

	public void sacar(double valor) {
		saldo -= valor;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}
}
