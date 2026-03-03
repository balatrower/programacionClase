package B400_OOPAVANZADA.E402ANIMALES;

public abstract class Mamifero extends Animal {
    public Mamifero() {
        super();
    }

    public Mamifero(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        setVitalidad(getVitalidad() - 5);
    }
}
