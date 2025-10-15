public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador(100, 30, 50);

        PocaoVida vida = new PocaoVida("Poção de Vida", "Recupera a vida do jogador", 1);
        PocaoAtaque ataque = new PocaoAtaque("Poção de Ataque", "Aumenta o ataque do jogador", 1);
        PocaoEnergia energia = new PocaoEnergia("Poção de Energia", "Recupera energia", 1);

        vida.efeito(jogador);
        ataque.efeito(jogador);
        energia.efeito(jogador);

        System.out.println("Status final do jogador:");
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Ataque: " + jogador.getAtaque());
        System.out.println("Energia: " + jogador.getEnergia());
    }
}