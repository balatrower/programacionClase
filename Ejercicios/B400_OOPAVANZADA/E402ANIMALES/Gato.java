package B400_OOPAVANZADA.E402ANIMALES;

public class Gato extends Mamifero {
    public Gato() {
        super();
    }

    public Gato(int cantidadVitalidad) {
        super(cantidadVitalidad);
    }

    @Override
    public void hablar() {
        if (getVitalidad() < 30) {
            IO.println("miauuuuu...");
        } else if (getVitalidad() < 70) {
            IO.println("miau");
        } else {
            IO.println("MIAU!!!");
        }

        super.hablar();
    }

    @Override
    public void come(int cantidadComida) {
        setVitalidad(getVitalidad() + (12 * cantidadComida));
    }
}
