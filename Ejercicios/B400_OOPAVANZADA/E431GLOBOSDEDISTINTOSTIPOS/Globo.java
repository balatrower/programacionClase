package B400_OOPAVANZADA.E431GLOBOSDEDISTINTOSTIPOS;

import java.util.Random;

public abstract class Globo {
    public static final int RANDOM_MIN = 10;
    public static final int RANDOM_MAX = 50;

    private Random random = new Random();
    private int capacidad;
    private int aire = 0;

    public Globo() {
        this.capacidad = random.nextInt(RANDOM_MIN, RANDOM_MAX+1);
    }

    public Globo(int valor) {
        capacidad = valor;
    }

    public int getAire() {
        return aire;
    }

    public void setAire(int aire) {
        this.aire = aire;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String toString() {
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; (i < aire) && (i < capacidad); i++) {
            cadena.append("*");
        }
        for (int i = aire; i < capacidad; i++) {
            cadena.append("O");
        }
        for (int i = capacidad; i < aire; i++) {
            cadena.append("!");
        }

        return cadena.toString();
    }

    public void inflar(int cantidad) {
        aire = aire + cantidad;
    }

    public abstract boolean explotado();
}
