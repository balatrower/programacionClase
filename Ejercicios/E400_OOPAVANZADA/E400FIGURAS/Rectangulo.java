package E400_OOPAVANZADA.E400FIGURAS;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double altura, double base) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
