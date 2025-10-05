package modelo;

import java.util.ArrayList;

public class Turma {
    private String nomeDisciplina;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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

    @Override
    public String toString() {
        return "Turma: " + nomeDisciplina + " | Quantidade de alunos: " + alunos.size();
    }
}
