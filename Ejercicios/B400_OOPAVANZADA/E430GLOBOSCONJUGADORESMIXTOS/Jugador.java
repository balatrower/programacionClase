package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public abstract class Jugador {
    private int puntuacion;

    Jugador() {
        setPuntuacion(0);
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void aumentarPuntuacionEnUno() {
        setPuntuacion(getPuntuacion() + 1);
    }

    public abstract int determinarSoplo();
}