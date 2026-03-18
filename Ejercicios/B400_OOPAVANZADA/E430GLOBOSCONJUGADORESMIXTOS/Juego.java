package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public class Juego {
    private Jugador j1;
    private Jugador j2;

    private Globo g1;
    private Globo g2;
    private Globo g3;
    private Globo g4;
    private Globo g5;

    Juego(Globo g1, Globo g2, Globo g3, Globo g4, Globo g5, String modoDeJuego) {
        configurarModoDeJuego(modoDeJuego);

        setG1(g1);
        setG2(g2);
        setG3(g3);
        setG4(g4);
        setG5(g5);
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setG1(Globo g1) {
        this.g1 = g1;
    }

    public Globo getG1() {
        return g1;
    }

    public void setG2(Globo g2) {
        this.g2 = g2;
    }

    public Globo getG2() {
        return g2;
    }

    public void setG3(Globo g3) {
        this.g3 = g3;
    }

    public Globo getG3() {
        return g3;
    }

    public void setG4(Globo g4) {
        this.g4 = g4;
    }

    public Globo getG4() {
        return g4;
    }

    public void setG5(Globo g5) {
        this.g5 = g5;
    }

    public Globo getG5() {
        return g5;
    }

    public void empezar() {
        int numRonda = 1;
        IO.println("BIENVENIDOS AL JUEGO DE EXPLOTAR LOS GLOBOS");
        do {
            IO.println("RONDA " + numRonda);
            IO.println("PUNTOS J1: " + getJ1().getPuntuacion() + " - " + getJ2().getPuntuacion() + " J2 PUNTOS");
            ronda(numRonda);
            numRonda++;
        } while (getJ1().getPuntuacion() != 3 && getJ2().getPuntuacion() != 3);

        IO.println("PUNTUACION FINAL:");
        IO.println("PUNTOS J1: " + getJ1().getPuntuacion() + " - " + getJ2().getPuntuacion() + " J2 PUNTOS");

        imprimirEstadoGlobos();
    }

    private void ronda(int numRonda) {
        Globo g = elegirGlobo(numRonda);
        do {
            IO.println("TURNO DEL JUGADOR 1");
            turnoJ1(g);

            if (g.haExplotado()) {
                continue; //nos evita turno jugador 2 innecesario
            }

            IO.println("TURNO DEL JUGADOR 2");
            turnoJ2(g);
        } while (!(g.haExplotado()));
    }

    private Globo elegirGlobo(int idGlobo) {
        switch (idGlobo) {
            case 1 -> {
                return getG1();
            }
            case 2 -> {
                return getG2();
            }
            case 3 -> {
                return getG3();
            }
            case 4 -> {
                return getG4();
            }
            default -> {
                return getG5();
            }
        }
    }

    private void turnoJ1(Globo g) {
        int cantidadAire = getJ1().determinarSoplo();
        g.inflar(cantidadAire);

        if (getJ1().getClass().getSimpleName().equals("JugadorCPU")) {
            IO.println("La CPU ha soplado " + cantidadAire + " unidades de aire");
        }

        if (g.haExplotado()) {
            aumentarPuntuacionJ2();
            IO.println("EL GLOBO HA EXPLOTADO, CAPACIDAD MAXIMA: " + g.getCapacidadMax());
        }

        IO.println("");
    }

    private void turnoJ2(Globo g) {
        int cantidadAire = getJ2().determinarSoplo();
        g.inflar(cantidadAire);

        if (getJ2().getClass().getSimpleName().equals("JugadorCPU")) {
            IO.println("La CPU ha soplado " + cantidadAire + " unidades de aire");
        }

        if (g.haExplotado()) {
            aumentarPuntuacionJ1();
            IO.println("EL GLOBO HA EXPLOTADO, CAPACIDAD MAXIMA: " + g.getCapacidadMax());
        }

        IO.println("");
    }

    private void aumentarPuntuacionJ1() {
        getJ1().aumentarPuntuacionEnUno();
    }

    private void aumentarPuntuacionJ2() {
        getJ2().aumentarPuntuacionEnUno();
    }

    private void imprimirEstadoGlobos() {
        for (int i = 1; i < 6; i++) {
            IO.println(elegirGlobo(i));
        }
    }

    private void configurarModoDeJuego(String modoDeJuego) {
        if (modoDeJuego.equals("hh")) {
            setJ1(new JugadorHumano());
            setJ2(new JugadorHumano());
        } else if (modoDeJuego.equals("hc")) {
            setJ1(new JugadorHumano());
            setJ2(new JugadorCPU());
        } else {
            setJ1(new JugadorCPU());
            setJ2(new JugadorCPU());
        }
    }
}