package B400_OOPAVANZADA.E401FIGURASDECOLORES;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        setRadio(radio);
    }

    public double calcularArea() {
        return Math.PI * getRadio() * getRadio();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.getColor() + "Circulo con radio " + getRadio() + "\u001B[0m";
    }
}