package questao1_figuras;

import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a figura (quadrado, retangulo, triangulo, circulo):");
        String tipo = sc.next().trim().toLowerCase();
        Figura fig = null;
        try {
            switch(tipo) {
                case "quadrado":
                    System.out.print("Lado: ");
                    double lado = sc.nextDouble();
                    fig = new Quadrado(lado);
                    break;
                case "retangulo":
                    System.out.print("Largura: ");
                    double largura = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    fig = new Retangulo(largura, altura);
                    break;
                case "triangulo":
                    System.out.print("Lado a: ");
                    double a = sc.nextDouble();
                    System.out.print("Lado b: ");
                    double b = sc.nextDouble();
                    System.out.print("Lado c: ");
                    double c = sc.nextDouble();
                    fig = new Triangulo(a,b,c);
                    break;
                case "circulo":
                    System.out.print("Raio: ");
                    double r = sc.nextDouble();
                    fig = new Circulo(r);
                    break;
                default:
                    System.out.println("Tipo desconhecido.");
                    System.exit(1);
            }
            System.out.printf("Área da %s = %.4f\n", fig.getClass().getSimpleName(), fig.calcularArea());
        } catch (Exception e) {
            System.out.println("Entrada inválida: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
