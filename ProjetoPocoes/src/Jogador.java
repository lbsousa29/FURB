public class Jogador {
    private int vida;
    private int ataque;
    private int energia;

    public Jogador(int vida, int ataque, int energia) {
        this.vida = vida;
        this.ataque = ataque;
        this.energia = energia;
    }

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public int getEnergia() { return energia; }
    public void setEnergia(int energia) { this.energia = energia; }
}