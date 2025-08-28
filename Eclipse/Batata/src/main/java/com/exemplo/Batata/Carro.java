package com.exemplo.Batata;

public class Carro {
	private Pessoa motorista;
	private String marca;
	
	public Carro(String marca, Pessoa motorista) {
		setMarca(marca);
		setMotorista( motorista);
	}
	
	public Pessoa getMotorista() {
		return motorista;
	}
	public void setMotorista(Pessoa motorista) {
		if (motorista == null) {
			throw new IllegalArgumentException("Motorista inválido");
		}
			this.motorista = motorista;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.trim().isEmpty()) {
			throw new IllegalArgumentException("marca inválido");
		}
			this.marca = marca;
	}
	
	
	
}
