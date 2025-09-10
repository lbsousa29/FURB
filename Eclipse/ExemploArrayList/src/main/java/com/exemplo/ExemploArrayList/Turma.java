package com.exemplo.ExemploArrayList;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

public class Turma {
	private Turno turno;
	private String cod;
	private ArrayList<Aluno> alunos;
	
	
	public Turma(Turno turno, String cod) {
		setTurno(turno);
		setCod(cod);
		alunos = new ArrayList();
		
	}
	

	
	public ArrayList<Aluno> listar(){
		return alunos;
	}
	
	public void atualizar(Aluno aluno) {
		
		Aluno antigo = buscar(aluno.getNome());
		if (antigo == null) {
			throw new IllegalArgumentException("Aluno não existe");
		}
		antigo.setIdade(aluno.getIdade());
	}
	
	public void remover(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	
	
	public void adicionar(Aluno aluno) {
		if (alunos == null) {
			throw new IllegalArgumentException("Aluno inválido");
		}
		alunos.add(aluno);
	}
	public Aluno buscar(String nome) {
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getNome().equals(nome)) {
				return alunos.get(i);
			}
		}
		for(Aluno aluno: alunos) {
			if (aluno.getNome().equals(nome)) {
				return aluno;
			}
		}
		return null;
	}
	
	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		if (turno == null) {
			throw new IllegalArgumentException("Turno inválido");
		}
		this.turno = turno;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	}
