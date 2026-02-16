package B300_OOPBASICA.E335BINGOCONMAINCOMPLETO;

import java.util.ArrayList;

public class Principal {
    void main() {
        int cantidadCartones = 5;
        Bombo b = new Bombo(16);
        ArrayList<Carton> cartones = new ArrayList<>();
        inicializarCartones(b, cartones, cantidadCartones);

        boolean hayBingo = false;
        String numeroGanador = "";
        do {
            int bolaActual = b.dameBola();
            IO.println("Ha salido la bola: " + bolaActual);

            for (int i = 1; i < cartones.size() + 1; i++) {
                Carton cartonActual = cartones.get(i - 1);
                cartonActual.anotaBola(bolaActual);

                if (cartonActual.hayBingo()) {
                    hayBingo = true;
                    numeroGanador = numeroGanador + i;
                }

                IO.println("Jugador " + i);
                IO.println(cartonActual.toString());
            }

            IO.println("");
        } while (!hayBingo);

        IO.println("El ganador es: " + numeroGanador);
    }

    private void inicializarCartones(Bombo bombo, ArrayList<Carton> cartones, int cantidadCartones) {
        for (int i = 0; i < cantidadCartones; i++) {
            cartones.add(i, new Carton(bombo));
        }
    }
}
