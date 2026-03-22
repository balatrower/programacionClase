package B200_ALGORITMICA;

import java.util.Arrays;

public class E238CONECTACUATRO {
    void main() {
        IO.println("JUEGO DEL CONECTA CUATRO");

        boolean juegoTerminado = false;
        int[][] tablero = new int[6][7];
        int[] alturas = new int[6];
        Arrays.fill(alturas, alturas.length - 1);
        int ganador = 0;
        do {
            int numJugador = 1;

            int columnaElegida = devolverNumeroColumnaElegidaSiValida(tablero, alturas, numJugador);
            anotarFichaEnTablero(tablero, alturas, columnaElegida, numJugador);

            if (haGanado(tablero, alturas,numJugador, columnaElegida)) {
                juegoTerminado = true;
                ganador = numJugador;
                break;
            }

            mostrarTablero(tablero);

            numJugador = alternarNumJugador(numJugador);

            columnaElegida = devolverNumeroColumnaElegidaSiValida(tablero, alturas, numJugador);
            anotarFichaEnTablero(tablero, alturas, columnaElegida, numJugador);

            if (haGanado(tablero, alturas, numJugador, columnaElegida)) {
                juegoTerminado = true;
                ganador = numJugador;
            }

            mostrarTablero(tablero);
        } while (!juegoTerminado);

        IO.println("El ganador es el jugador: " + ganador);
    }

    void mostrarTablero(int[][] tablero) {
        IO.println("-----------------------------");
        for (int i = 0; i < tablero.length; i++) {
            IO.print("|");
            for (int j = 0; j < tablero[i].length; j++) {
                char caraterJugador = ' ';

                if (tablero[i][j] == 1) {
                    caraterJugador = 'x';
                } else if (tablero[i][j] == 2) {
                    caraterJugador = 'O';
                } else {
                    caraterJugador = '-';
                }

                IO.print(" " + caraterJugador + " |");
            }
            IO.print("\n");
        }
        IO.println("-----------------------------");
        IO.println("");
    }

    boolean haGanado(int[][] tablero, int[] alturas, int numJugador, int columnaUltimaFicha) {
        boolean haGanado = false;
        int conteo = 1;
        int fila = 0;
        int columna = 0;
        int filaFicha = alturas[columnaUltimaFicha];

        // comprobacion horizontal
        columna = columnaUltimaFicha - 1;
        while (columna >= 0 && tablero[filaFicha][columna] == numJugador) {
            conteo++;
            columna--;
        }

        columna = columnaUltimaFicha + 1;

        while (columna < tablero[0].length && tablero[filaFicha][columna] == numJugador) {
            conteo++;
            columna++;
        }

        if (conteo >= 4) {
            haGanado = true;
            return haGanado;
        }

        // comprobacion vertical
        conteo = 1;
        fila = filaFicha + 1;
        while (fila < tablero.length && tablero[fila][columnaUltimaFicha] == numJugador) {
            conteo++;
            fila++;
        }

        if (conteo >= 4) {
            haGanado= true;
            return haGanado;
        }

        // comprobacion diagonal
        conteo = 1;
        fila = filaFicha - 1;
        columna = columnaUltimaFicha - 1;

        while (fila >= 0 && columna >= 0 && tablero[fila][columna] == numJugador) {
            conteo++;
            fila--;
            columna--;
        }

        fila = filaFicha + 1;
        columna = columnaUltimaFicha + 1;

        while (fila < tablero.length && columna < tablero[0].length && tablero[fila][columna] == numJugador) {
            conteo++;
            fila++;
            columna++;
        }

        if (conteo >= 4) {
            haGanado = true;
            return haGanado;
        }

        // comprobacion diagonal del otro lado
        conteo = 1;
        fila = filaFicha + 1;
        columna = columnaUltimaFicha - 1;

        while (fila < tablero.length && columna >= 0 && tablero[fila][columna] == numJugador) {
            conteo++;
            fila++;
            columna--;
        }

        fila = filaFicha - 1;
        columna = columnaUltimaFicha + 1;

        while (fila >= 0 && columna < tablero[0].length && tablero[fila][columna] == numJugador) {
            conteo++;
            fila--;
            columna++;
        }

        if (conteo >= 4) {
            haGanado = true;
            return haGanado;
        }

        return haGanado;
    }

    int alternarNumJugador(int numJugador) {
        if (numJugador == 1) {
            numJugador++;
            return numJugador;
        } else {
            numJugador--;
            return numJugador;
        }
    }

    void anotarFichaEnTablero(int[][] tablero, int[] alturas, int columnaElegida, int numJugador) {
        tablero[alturas[columnaElegida]][columnaElegida] = numJugador;
        if (!(alturas[columnaElegida] == 0)) {
            alturas[columnaElegida]--;
        }
    }

    int devolverNumeroColumnaElegidaSiValida(int[][] tablero, int[] alturas, int numJugador) {
        boolean columnaValida = false;
        int columnaElegida = 0;
        do {
            try {
                columnaElegida = Integer.parseInt(IO.readln("Introduce columna: "));

                if (columnaElegida > 7) {
                    columnaElegida = 1;
                }

                if (tablero[columnaElegida][alturas[columnaElegida]] != 0) {
                    IO.println("Ya hay una ficha ahi, escoje otra columna");
                } else {
                    columnaValida = true;
                }
            } catch (Exception enrique) {
                IO.println("Error: numero no valido, prueba otro");
            }
        } while (!columnaValida);
        return columnaElegida - 1;
    }
}
