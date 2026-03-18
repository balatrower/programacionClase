package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public class JugadorCPU extends Jugador {
    JugadorCPU() {
        super();
    }

    @Override
    public int determinarSoplo() {
        return Utils.generarNumeroAleatorio(1, 49);
    }
}
