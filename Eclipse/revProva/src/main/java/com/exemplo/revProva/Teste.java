package com.exemplo.revProva;

public class Teste {
public static void main(String[] args) {
	Contrato contrato = new Contrato("Locação de equipamento");
	
	Item item1 = new Item ("Carro", 2 ,150);

	Item item2 = new Item ("Moto", 1, 50);
	
	contrato.addItem(item1);
	contrato.addItem(item2);
	
	
	contrato.listarItens();
	System.out.println("Valor total: " + contrato.calcularTotal());
	
	
}
}
