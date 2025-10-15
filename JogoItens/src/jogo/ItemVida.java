package jogo;

public class ItemVida extends Item {

    public ItemVida(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void aplicarEfeito(Jogador jogador) {
        jogador.setVida(jogador.getVida() + valor);
        System.out.println(nome + " aplicado! Vida aumentada em " + valor);
    }
}
