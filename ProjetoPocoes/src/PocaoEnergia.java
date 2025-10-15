public class PocaoEnergia extends Item {

    public PocaoEnergia(String nome, String descricao, int quantidade) {
        super(nome, descricao, quantidade);
    }

    @Override
    public void efeito(Jogador jogador) {
        jogador.setEnergia(jogador.getEnergia() + 10);
        System.out.println("A poção de energia restaurou a energia do jogador!");
    }
}