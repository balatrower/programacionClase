package B400_OOPAVANZADA.E400FIGURAS;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    public double getLado() {
        return this.base;
    }

    public void setBase(double base) {
        setLado(base);
    }

    public void setAltura(double altura) {
        setLado(altura);
    }
}
