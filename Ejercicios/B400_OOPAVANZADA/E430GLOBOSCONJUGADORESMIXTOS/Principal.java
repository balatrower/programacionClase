package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public class Principal {
    void main() {
        Globo g1 = new Globo();
        Globo g2 = new Globo();
        Globo g3 = new Globo();
        Globo g4 = new Globo();
        Globo g5 = new Globo();

        IO.println("Como quieres que sea el modo de juego: HvsH, HvsC, CvsC  |  H = Humano / C = CPU");
        String modoDeJuego = pedirModoJuegoUsuario();
        modoDeJuego = devolverModoDeJuegoProcesado(modoDeJuego);

        Juego juego = new Juego(g1, g2, g3, g4, g5, modoDeJuego);
        juego.empezar();
    }

    public String pedirModoJuegoUsuario() {
        String modoDeJuego;
        do {
            modoDeJuego = IO.readln().toLowerCase();
        } while (modoDeJuego.isEmpty());
        return modoDeJuego;
    }

    public String devolverModoDeJuegoProcesado(String modoDeJuego) {
        String modoDeJuegoAux;
        if (modoDeJuego.length() == 4) {
            modoDeJuegoAux = modoDeJuego + modoDeJuego.charAt(0) + modoDeJuego.charAt(3); //eliminar vs en el string si hay
        } else {
            modoDeJuegoAux = modoDeJuego;
        }
        return modoDeJuegoAux;
    }
}