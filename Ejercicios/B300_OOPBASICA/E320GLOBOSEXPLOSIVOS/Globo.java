package B300_OOPBASICA.E320GLOBOSEXPLOSIVOS;

public class Globo {
    private int capacidadMax;
    private int aireActual;

    Globo() {
        setCapacidadMax(generarNumeroAleatorio(10, 50));
        setAireActual(0);
    }

    Globo(int capacidadMax) {
        setCapacidadMax(capacidadMax);
        setAireActual(0);
    }

    @Override
    public String toString() {
        String cantidadAireString = sacarCadenaCantidadAire();
        return "Aire actual: " + cantidadAireString;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getAireActual() {
        return aireActual;
    }

    public void setAireActual(int aireActual) {
        this.aireActual = aireActual;
    }

    public void inflar(int cantidad) {
        if (getAireActual() + cantidad >= getCapacidadMax()) {
            setAireActual(getCapacidadMax() + 1);
        } else {
            setAireActual(getAireActual() + cantidad);
        }
    }

    public boolean haExplotado() {
        return getAireActual() > getCapacidadMax();
    }

    private int generarNumeroAleatorio(int min, int max) {
        double numeroAleatorio = Math.random() * (max - min) + min;
        return (int) numeroAleatorio;
    }

    private String sacarCadenaCantidadAire() {
        String cadenaAire = "";
        cadenaAire = sacarCadenaAireActual() + sacarCadenaAireRestante();
        return cadenaAire;
    }

    private String sacarCadenaAireActual() {
        String cadenaAire = "";
        for (int i = 0; i < getAireActual(); i++) {
            cadenaAire = cadenaAire + "*";
        }
        return cadenaAire;
    }

    private String sacarCadenaAireRestante() {
        String cadenaAire = "";
        for (int i = getCapacidadMax() - 1; i > getAireActual(); i--) { //para que no salga una O fantasma el + 1
            cadenaAire = cadenaAire + "O";
        }
        return cadenaAire;
    }
}
