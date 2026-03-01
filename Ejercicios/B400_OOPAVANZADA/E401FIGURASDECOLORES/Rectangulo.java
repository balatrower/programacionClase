package B400_OOPAVANZADA.E401FIGURASDECOLORES;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        setBase(base);
        setAltura(altura);
    }

    public double calcularArea() {
        return getBase() * getAltura();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.getColor() + "Rectangulo de base " + getBase() + " y altura " + getAltura() + "\u001B[0m";
    }
}