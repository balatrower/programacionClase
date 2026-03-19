package B200_ALGORITMICA.E231TRESENRAYACASIOOP;

public class Tablero {
    private static int[][] matriz = new int[3][3];
    private static int jugadorActual = 1;

    public static void dibujar() {
        IO.println("-------------");
        for (int i = 0; i < matriz.length; i++) {
            IO.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                char caraterJugador = ' ';

                if (matriz[i][j] == 1) {
                    caraterJugador = 'x';
                } else if (matriz[i][j] == 2) {
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

    public static void marcar(int fil, int col) {
        matriz[fil - 1][col - 1] = jugadorActual; // usuario no tiene porque contar desde 0
    }

    public static int getJugadorActual() {
        return jugadorActual;
    }

    public static void alternarJugador() {
        jugadorActual = (jugadorActual == 1) ? 2 : 1;
    }

    public static int buscarGanador() {
        if (esGanador(1)) {
            return 1;
        } else if (esGanador(2)) {
            return 2;
        } else return -1;
    }

    private static boolean esGanador(int numJugador) {
        for (int i = 0; i < matriz[0].length; i++) {
            if (matriz[i][0] == numJugador && matriz[i][1] == numJugador && matriz[i][2] == numJugador) {
                return true;
            }
        }

        for (int i = 0; i < matriz[0].length; i++) {
            if (matriz[0][i] == numJugador && matriz[1][i] == numJugador && matriz[2][i] == numJugador) {
                return true;
            }
        }

        if (matriz[0][0] == numJugador && matriz[1][1] == numJugador && matriz[2][2] == numJugador) return true;
        if (matriz[2][0] == numJugador && matriz[1][1] == numJugador && matriz[0][2] == numJugador) return true;

        return false;
    }
}