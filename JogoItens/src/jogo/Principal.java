package jogo;

public class Principal {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Lucas", 100, 50, 75);

        Item pocaoVida = new ItemVida("Poção de Vida", 20);
        Item pocaoMana = new ItemMana("Poção de Mana", 15);
        Item pocaoEstamina = new ItemEstamina("Poção de Estamina", 10);

        jogador.exibirStatus();

        jogador.aplicarItem(pocaoVida);
        jogador.aplicarItem(pocaoMana);
        jogador.aplicarItem(pocaoEstamina);

        jogador.exibirStatus();
    }
}
