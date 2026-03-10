package B400_OOPAVANZADA.E404FIGURASCOMPARABLES;

public abstract class Figura implements Comparable<Figura> {
    public abstract double calcularArea();

    @Override
    public int compareTo(Figura otraFigura) {
        return Double.compare(this.calcularArea(), otraFigura.calcularArea());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " con area: " + calcularArea();
    }
}