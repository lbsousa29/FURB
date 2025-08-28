package com.exemplo.Batata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void testeNomeInvalido() {
		String nome = "";
		
		String mensagemEsperada = "Nome inválido";
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			Pessoa p = new Pessoa(nome);
		});
		
		
		assertEquals(mensagemEsperada, ex.getLocalizedMessage());
		
	}
}
