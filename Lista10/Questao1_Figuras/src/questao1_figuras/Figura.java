package questao1_figuras;

public abstract class Figura {
    public abstract double calcularArea();
    @Override
    public String toString() {
        return String.format("%s (área=%.4f)", this.getClass().getSimpleName(), calcularArea());
    }
}
