package B400_OOPAVANZADA.E402ANIMALES;

public class Conejo extends Mamifero{
    public Conejo() {
        super();
    }

    public Conejo(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        if (getVitalidad() < 30) {
            IO.println("hrrrrrr...");
        } else if (getVitalidad() < 70) {
            IO.println("hrrr");
        } else {
            IO.println("HRRR!!!");
        }

        super.hablar();
    }

    @Override
    public void come(int cantidadComida) {
        setVitalidad(getVitalidad() + (8 * cantidadComida));
    }
}
