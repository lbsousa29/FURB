package app;

import modelo.Aluno;
import modelo.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turmaPOO = new Turma("Programação Orientada a Objetos");

        Aluno a1 = new Aluno("Lucas", 745.0);
        Aluno a2 = new Aluno("Maria", 820.5);
        Aluno a3 = new Aluno("João", 820.5);
        Aluno a4 = new Aluno("Pedro", 610.0);

        turmaPOO.incluirAluno(a1);
        turmaPOO.incluirAluno(a2);
        turmaPOO.incluirAluno(a3);
        turmaPOO.incluirAluno(a4);

        System.out.println(turmaPOO);
        System.out.println("\nLista de alunos:");
        for (Aluno a : turmaPOO.getAlunos()) {
            System.out.println(a);
        }

        System.out.println("\nAluno com melhor nota ENEM:");
        System.out.println(turmaPOO.obterAlunoMelhorNotaEnem());
    }
}
