package questao1_figuras;

public class Triangulo extends Figura {
    private double a, b, c;
    public Triangulo(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }
    @Override
    public double calcularArea() {
        double p = (a + b + c) / 2.0;
        double value = p * (p - a) * (p - b) * (p - c);
        if (value <= 0) return 0.0; // degenerate triangle -> area 0
        return Math.sqrt(value);
    }
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
}
