package B400_OOPAVANZADA.E400FIGURAS;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo(double altura, double base) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }
}
