package questao1_figuras;

public class Quadrado extends Figura {
    private double lado;
    public Quadrado(double lado) { this.lado = lado; }
    public double getLado() { return lado; }
    @Override
    public double calcularArea() { return lado * lado; }
}
