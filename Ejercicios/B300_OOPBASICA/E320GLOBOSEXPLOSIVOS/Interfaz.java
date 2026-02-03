package B300_OOPBASICA.E320GLOBOSEXPLOSIVOS;

public class Interfaz {
    private int puntuacionJ1;
    private int puntuacionJ2;

    private Globo g1;
    private Globo g2;
    private Globo g3;
    private Globo g4;
    private Globo g5;

    Interfaz(Globo g1, Globo g2, Globo g3, Globo g4, Globo g5) {
        setPuntuacionJ1(0);
        setPuntuacionJ2(0);

        setG1(g1);
        setG2(g2);
        setG3(g3);
        setG4(g4);
        setG5(g5);
    }

    public void setPuntuacionJ1(int puntuacionJ1) {
        this.puntuacionJ1 = puntuacionJ1;
    }

    public int getPuntuacionJ1() {
        return puntuacionJ1;
    }

    public void setPuntuacionJ2(int puntuacionJ2) {
        this.puntuacionJ2 = puntuacionJ2;
    }

    public int getPuntuacionJ2() {
        return puntuacionJ2;
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
            IO.println("PUNTOS J1: " + getPuntuacionJ1() + " - " + getPuntuacionJ2() + " J2 PUNTOS");
            ronda(numRonda);
            numRonda++;
        } while (getPuntuacionJ1() != 3 && getPuntuacionJ2() != 3);

        IO.println("PUNTUACION FINAL:");
        IO.println("PUNTOS J1: " + getPuntuacionJ1() + " - " + getPuntuacionJ2() + " J2 PUNTOS");

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
        g.inflar(pedirNumeroEnteroNoNegativo());

        if (g.haExplotado()) {
            aumentarPuntuacionJ2();
            IO.println("EL GLOBO HA EXPLOTADO, CAPACIDAD MAXIMA: " + g.getCapacidadMax());
        }

        IO.println("");
    }

    private void turnoJ2(Globo g) {
        g.inflar(pedirNumeroEnteroNoNegativo());

        if (g.haExplotado()) {
            aumentarPuntuacionJ1();
            IO.println("EL GLOBO HA EXPLOTADO, CAPACIDAD MAXIMA: " + g.getCapacidadMax());
        }

        IO.println("");
    }

    private void aumentarPuntuacionJ1() {
        setPuntuacionJ1(getPuntuacionJ1() + 1);
    }

    private void aumentarPuntuacionJ2() {
        setPuntuacionJ2(getPuntuacionJ2() + 1);
    }

    private int pedirNumeroEnteroNoNegativo() {
        int numero = 0;
        do {
            try {
                numero = Integer.parseInt(IO.readln("INTRODUCE UNA CANTIDAD DE AIRE PARA INFLAR EL GLOBO: "));
            } catch (Exception enrique) {
                IO.println("ESE NUMERO NO ES VALIDO");
            }
        } while (numero <= 0);
        return numero;
    }

    private void imprimirEstadoGlobos() {
        for (int i = 1; i < 6; i++) {
            IO.println(elegirGlobo(i));
        }
    }
}
