public class PocaoAtaque extends Item {

    public PocaoAtaque(String nome, String descricao, int quantidade) {
        super(nome, descricao, quantidade);
    }

    @Override
    public void efeito(Jogador jogador) {
        jogador.setAtaque(jogador.getAtaque() + 10);
        System.out.println("A poção de ataque aumentou o poder de ataque do jogador!");
    }
}