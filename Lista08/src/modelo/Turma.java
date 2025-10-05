package modelo;

import java.util.ArrayList;

public class Turma {
    private String nomeDisciplina;
    private String turno;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeDisciplina, String turno, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.turno = turno;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        if (alunos.isEmpty()) return null;
        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNotaEnem() > melhor.getNotaEnem()) {
                melhor = a;
            }
        }
        return melhor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getTurno() {
        return turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Turma: " + nomeDisciplina +
               " | Turno: " + turno +
               " | Professor: " + professor.getNome() +
               " | Total de alunos: " + alunos.size();
    }
}
