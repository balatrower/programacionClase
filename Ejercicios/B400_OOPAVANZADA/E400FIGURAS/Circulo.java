package B400_OOPAVANZADA.E400FIGURAS;

public class Circulo extends Figura {
    private double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 2 * Math.PI * radio;
    }
}
