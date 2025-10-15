package jogo;

public abstract class Item {
    protected String nome;
    protected int valor;

    public Item(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public abstract void aplicarEfeito(Jogador jogador);
}
