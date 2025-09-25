package com.exemplo.Exemplo2409;

public class RoupaCasa extends Roupa {

	public RoupaCasa(int tamanho, String cor) {
		super(tamanho, cor);
	}
	
	
	@Override //crie o mesmo metodo mas ignora o outro da classe mae
	public void usar() {
		super.usar();
		System.out.println("Usando a roupa " + this.cor);
	}
	
	
	
}
