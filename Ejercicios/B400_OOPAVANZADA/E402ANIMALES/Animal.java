package B400_OOPAVANZADA.E402ANIMALES;

public abstract class Animal {
    private int vitalidad;

    public Animal() {
        setVitalidad(100);
    }

    public Animal(int cantidadVitalidad) {
        setVitalidad(cantidadVitalidad);
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        if (vitalidad > 100) {
            this.vitalidad = 100;
        } else if (vitalidad < 0) {
            this.vitalidad = 0;
        } else {
            this.vitalidad = vitalidad;
        }
    }

    public abstract void come(int cantidadComida);
    public abstract void hablar();
}
