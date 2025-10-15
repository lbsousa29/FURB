public class PocaoVida extends Item {

    public PocaoVida(String nome, String descricao, int quantidade) {
        super(nome, descricao, quantidade);
    }

    @Override
    public void efeito(Jogador jogador) {
        jogador.setVida(jogador.getVida() + 20);
        System.out.println("A poção de vida aumentou a vida do jogador!");
    }
}