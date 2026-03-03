package B400_OOPAVANZADA.E402ANIMALES;

public abstract class Reptil extends Animal {
    public Reptil() {
        super();
    }

    public Reptil(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    public void hablar() {
        setVitalidad(getVitalidad() - 1);
    }
}
