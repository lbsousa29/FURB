package com.exemplo.Batata;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	Pessoa p = new Pessoa("Rogrigo Faro");
    	Carro carro = new Carro("Mercedes", p);
    	
    	System.out.println("Motorista : "+ carro.getMotorista().getNome());
    }
}
