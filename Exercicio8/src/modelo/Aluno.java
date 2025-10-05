package modelo;

public class Aluno {
    private String nome;
    private double notaEnem;

    public Aluno(String nome, double notaEnem) {
        this.nome = nome;
        this.notaEnem = notaEnem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Nota ENEM: " + notaEnem;
    }
}
