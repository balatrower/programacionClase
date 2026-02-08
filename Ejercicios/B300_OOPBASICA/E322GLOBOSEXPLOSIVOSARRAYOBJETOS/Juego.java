package B300_OOPBASICA.E322GLOBOSEXPLOSIVOSARRAYOBJETOS;

import java.util.ArrayList;

public class Juego {
    private int puntuacionJ1;
    private int puntuacionJ2;
    private int numRondas;
    private ArrayList<Globo> listaGlobos;


    Juego(int numRondas) {
        setPuntuacionJ1(0);
        setPuntuacionJ2(0);
        setNumRondas(numRondas);

        ArrayList<Globo> listaGlobos = new ArrayList<>();
        setListaGlobos(cargarGlobos(listaGlobos, numRondas));
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

    public void setListaGlobos(ArrayList<Globo> listaGlobos) {
        this.listaGlobos = listaGlobos;
    }

    public ArrayList<Globo> getListaGlobos() {
        return listaGlobos;
    }

    public void setNumRondas(int numRondas) {
        this.numRondas = numRondas;
    }

    public int getNumRondas() {
        return numRondas;
    }

    public void empezar() {
        int numRonda = 1;
        IO.println("BIENVENIDOS AL JUEGO DE EXPLOTAR LOS GLOBOS");
        do {
            IO.println("RONDA " + numRonda);
            IO.println("PUNTOS J1: " + getPuntuacionJ1() + " - " + getPuntuacionJ2() + " J2 PUNTOS");
            ronda(numRonda);
            numRonda++;
        } while (getPuntuacionJ1() != getNumRondas() / 2 + 1  && getPuntuacionJ2() != getNumRondas() / 2 + 1);

        IO.println("PUNTUACION FINAL:");
        IO.println("PUNTOS J1: " + getPuntuacionJ1() + " - " + getPuntuacionJ2() + " J2 PUNTOS");

        imprimirEstadoGlobos();
    }

    private void ronda(int numRonda) {
        Globo g = listaGlobos.get(numRonda - 1);
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
        for (Globo g: listaGlobos) {
            IO.println(g);
        }
    }

    private ArrayList<Globo> cargarGlobos(ArrayList<Globo> listaGlobos, int numRondas) {
        for (int i = 0; i < numRondas; i++) {
            Globo g = new Globo();
            listaGlobos.add(g);
        }
        return listaGlobos;
    }
}
