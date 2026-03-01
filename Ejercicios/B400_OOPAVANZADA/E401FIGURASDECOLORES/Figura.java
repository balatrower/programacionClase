package B400_OOPAVANZADA.E401FIGURASDECOLORES;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String toString();

    public abstract double calcularArea();
}