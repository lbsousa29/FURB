package jogo;

public class ItemEstamina extends Item {

    public ItemEstamina(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public void aplicarEfeito(Jogador jogador) {
        jogador.setEstamina(jogador.getEstamina() + valor);
        System.out.println(nome + " aplicado! Estamina aumentada em " + valor);
    }
}
