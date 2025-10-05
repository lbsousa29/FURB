package app;

import modelo.Aluno;
import modelo.Professor;
import modelo.Turma;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Robson Walter de Souza", "Mestre em Computação");
        Turma turmaPOO = new Turma("Programação Orientada a Objetos", "Noturno", prof);

        turmaPOO.incluirAluno(new Aluno("Lucas", 745.0));
        turmaPOO.incluirAluno(new Aluno("Maria", 820.5));
        turmaPOO.incluirAluno(new Aluno("João", 820.5));
        turmaPOO.incluirAluno(new Aluno("Pedro", 610.0));

        System.out.println(turmaPOO);
        System.out.println("\nLista de alunos:");
        for (Aluno a : turmaPOO.getAlunos()) {
            System.out.println(a);
        }

        System.out.println("\nAluno com melhor nota ENEM:");
        System.out.println(turmaPOO.obterAlunoMelhorNotaEnem());
    }
}
