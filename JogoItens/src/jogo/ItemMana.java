package jogo;

public class ItemMana extends Item {

    public ItemMana(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void aplicarEfeito(Jogador jogador) {
        jogador.setMana(jogador.getMana() + valor);
        System.out.println(nome + " aplicado! Mana aumentada em " + valor);
    }
}
