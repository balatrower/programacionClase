package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public class JugadorHumano extends Jugador {
    JugadorHumano() {
        super();
    }

    @Override
    public int determinarSoplo() {
        return Utils.pedirNumeroEnteroNoNegativo();
    }
}
