package questao1_figuras;

public class Retangulo extends Figura {
    private double largura, altura;
    public Retangulo(double largura, double altura) { this.largura = largura; this.altura = altura; }
    public double getLargura(){ return largura; }
    public double getAltura(){ return altura; }
    @Override
    public double calcularArea(){ return largura * altura; }
}
