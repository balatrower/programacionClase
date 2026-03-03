package B400_OOPAVANZADA.E402ANIMALES;

public class Lagartija extends Reptil {
    public Lagartija() {
        super();
    }

    public Lagartija(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        if (getVitalidad() < 30) {
            IO.println("tssssssst...");
        } else if (getVitalidad() < 70) {
            IO.println("tsst");
        } else {
            IO.println("TSST TSST!!!");
        }

        super.hablar();
    }

    @Override
    public void come(int cantidadComida) {
        setVitalidad(getVitalidad() + (10 * cantidadComida));
    }
}
