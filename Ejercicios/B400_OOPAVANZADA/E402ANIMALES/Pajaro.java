package B400_OOPAVANZADA.E402ANIMALES;

public class Pajaro extends Ave {
    public Pajaro() {
        super();
    }

    public Pajaro(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        if (getVitalidad() < 30) {
            IO.println("piooooo...");
        } else if (getVitalidad() < 70) {
            IO.println("pio");
        } else {
            IO.println("PIO!!!");
        }

        super.hablar();
    }

    @Override
    public void come(int cantidadComida) {
        setVitalidad(getVitalidad() + (5 * cantidadComida));
    }
}
