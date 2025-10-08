package questao1_figuras;

public class Circulo extends Figura {
    private double raio;
    public Circulo(double raio) { this.raio = raio; }
    @Override
    public double calcularArea() { return Math.PI * raio * raio; }
    public double getRaio(){ return raio; }
}
