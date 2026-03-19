package B200_ALGORITMICA;

import java.util.Arrays;

public class E230TRESENRAYA {
    void main() {
        String ganador = "";
        boolean juegoTerminado = false;
        int idJugador1 = 1;
        int idJugador2 = 2;
        int[][] tablero = new int[3][3];

        IO.println("Bienvenidos al juego de 3 en raya!");
        while (!juegoTerminado) {
            mostrarTablero(tablero);

            turno(idJugador1, tablero);
            if (verificarGanador(idJugador1, tablero)) {
                juegoTerminado = true;
                ganador = "El jugador 1!!";
                break;
            }

            mostrarTablero(tablero);

            turno(idJugador2, tablero);
            if (verificarGanador(idJugador2 ,tablero)) {
                juegoTerminado = true;
                ganador = "El jugador 2!!";
                break;
            }

            if (verificarEmpate(tablero)) {
                juegoTerminado = true;
                ganador = "Ninguno, ha habido empate -_-";
            }
        }

        IO.println("El juego ha terminado!!");
        IO.println("El ganador es: " + ganador);
    }

    void mostrarTablero(int[][] tablero) {
        IO.println("-------------");
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
        IO.println("-------------");
        IO.println("");
    }

    void turno(int idJugador, int[][] tablero) {
        IO.println("Elije donde colocar tu ficha: ");
        boolean turnoCompletado = false;
        do {
            int[] valoresFichaUsuario = escojerLugarFicha();
            int columna = sacarColumna(valoresFichaUsuario);
            int fila = sacarFila(valoresFichaUsuario);

            if (tablero[fila][columna] == 0) {
                tablero[fila][columna] = idJugador;
                turnoCompletado = true;
            } else {
                IO.println("Ahi ya hay una ficha, escoje otro lugar");
            }
        } while (!turnoCompletado);
    }

    int[] escojerLugarFicha() {
        int[] valores = new int[2];
        int temp = 0;
        while (temp <= 0) {
            try {
                temp = Integer.parseInt(IO.readln("Introduce columna: "));

                if (temp > 3) {
                    temp = 3;
                }

                valores[0] = temp - 1; //usuario no empieza contando en 0
            } catch (Exception enrique) {
                IO.println("Error: numero no valido, prueba otro");
            }
        }

        temp = 0;
        while (temp <= 0) {
            try {
                temp = Integer.parseInt(IO.readln("Introduce fila: "));

                if (temp > 3) {
                    temp = 3;
                }

                valores[1] = temp - 1; //usuario no empieza contando en 0
            } catch (Exception enrique) {
                IO.println("Error: numero no valido, prueba otro");
            }
        }

        return valores;
    }

    int sacarColumna(int[] valores) {
        return valores[0];
    }

    int sacarFila(int[] valores) {
        return valores[1];
    }

    boolean verificarGanador(int idJugador, int[][] tablero) {
        for (int i = 0; i < tablero[0].length; i++) {
            if (tablero[i][0] == idJugador && tablero[i][1] == idJugador && tablero[i][2] == idJugador) {
                return true;
            }
        }

        for (int i = 0; i < tablero[0].length; i++) {
            if (tablero[0][i] == idJugador && tablero[1][i] == idJugador && tablero[2][i] == idJugador) {
                return true;
            }
        }

        if (tablero[0][0] == idJugador && tablero[1][1] == idJugador && tablero[2][2] == idJugador) return true;
        if (tablero[2][0] == idJugador && tablero[1][1] == idJugador && tablero[0][2] == idJugador) return true;

        return false;
    }

    boolean verificarEmpate(int[][] tablero) {
        boolean huecoEncontrado = false;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == '-') {
                    huecoEncontrado = true;
                }
            }
        }
        return huecoEncontrado;
    }
}
