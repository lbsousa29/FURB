package com.exemplo.testeJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		int valor1 = 10;
		int valor2 = 20;
		int esperado = 30;
		
		int resultado = Calculadora.somar(valor1, valor2);
		
		assertEquals(esperado, resultado);
	}

}
