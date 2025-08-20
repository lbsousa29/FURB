package Question2;


public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroDaConta;

    public String getTitular() {
        return titular;
    }
    public ContaBancaria( String titular, String numero) {
    	setTitular(titular);
    	setNumero(numero);
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.titular = titular;
    }

    public String getNumero() {
        return numeroDaConta;
    }

    public void setNumero(String numeroDaConta) {
        if (numeroDaConta == null || numeroDaConta.trim().isEmpty()) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, ContaBancaria destino) {
        if (destino == null) {
            throw new IllegalArgumentException("Conta de destino inválida");
        }
        this.sacar(valor); 
        destino.depositar(valor); 
    }
    
}
