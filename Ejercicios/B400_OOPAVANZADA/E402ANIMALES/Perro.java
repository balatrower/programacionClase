package B400_OOPAVANZADA.E402ANIMALES;

public class Perro extends Mamifero {
    public Perro() {
        super();
    }

    public Perro(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        if (getVitalidad() < 30) {
            IO.println("guauuuu...");
        } else if (getVitalidad() < 70) {
            IO.println("guau");
        } else {
            IO.println("GUAU!!!");
        }

        super.hablar();
    }

    @Override
    public void come(int cantidadComida) {
        setVitalidad(getVitalidad() + (7 * cantidadComida));
    }
}
