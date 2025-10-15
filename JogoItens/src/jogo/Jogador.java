package jogo;

public class Jogador {
    private String nome;
    private int vida;
    private int mana;
    private int estamina;

    public Jogador(String nome, int vida, int mana, int estamina) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.estamina = estamina;
    }

    public void aplicarItem(Item item) {
        item.aplicarEfeito(this);
    }

    public void exibirStatus() {
        System.out.println("Status do Jogador: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Estamina: " + estamina);
        System.out.println("------------------------");
    }

    // Getters e Setters
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }

    public int getEstamina() { return estamina; }
    public void setEstamina(int estamina) { this.estamina = estamina; }
}
