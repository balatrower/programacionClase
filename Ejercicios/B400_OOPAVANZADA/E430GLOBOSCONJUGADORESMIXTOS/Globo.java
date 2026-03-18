package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public class Globo {
    private int capacidadMax = Utils.generarNumeroAleatorio(10, 50);
    private int aireActual = 0;

    public Globo() {
    }

    public Globo(int capacidadMax) {
        setCapacidadMax(capacidadMax);
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

    private String sacarCadenaCantidadAire() {
        String cadenaAire = "";
        cadenaAire = sacarCadenaAireActual() + sacarCadenaAireRestante();
        return cadenaAire;
    }

    public String toString() {
        String representacion;

        if (!haExplotado()) {
            representacion = "*".repeat(getAireActual()) + "O".repeat(getCapacidadMax() - getAireActual());
        } else {
            representacion = "!".repeat(getCapacidadMax());
        }

        return "Aire actual: " + representacion;
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
}