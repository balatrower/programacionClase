package B400_OOPAVANZADA.E402ANIMALES;

public abstract class Ave extends Animal {
    public Ave() {
        super();
    }

    public Ave(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        setVitalidad(getVitalidad() - 2);
    }
}