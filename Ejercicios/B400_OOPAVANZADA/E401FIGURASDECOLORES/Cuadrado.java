package B400_OOPAVANZADA.E401FIGURASDECOLORES;

public class Cuadrado extends Rectangulo {
    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    public void setBase(double base) {
        super.setBase(base);
        super.setAltura(base);
    }

    public void setAltura(double altura) {
        super.setBase(altura);
        super.setAltura(altura);
    }

    public double getLado() {
        return base;
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    @Override
    public String toString() {
        return super.getColor() + "Cuadrado de lado " + getLado() + "\u001B[0m";
    }
}