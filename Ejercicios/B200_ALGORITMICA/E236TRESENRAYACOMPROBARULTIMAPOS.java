private int[][] tablero = new int[3][3]; // 0: libre; 1: jugador X, 2: jugador O
private char jugador = 'x';
private char ganador = ' ';

private int jugadasRestantes = 9;
private boolean sobreescribir;

private boolean hayGanador() {
    for (int i = 0; i < tablero.length; i++) {
        // Filas
        if (tablero[i][0] != 0 &&
                tablero[i][0] == tablero[i][1] &&
                tablero[i][0] == tablero[i][2])
            return true;

        // Columnas
        if (tablero[0][i] != 0 &&
                tablero[0][i] == tablero[1][i] &&
                tablero[0][i] == tablero[2][i])
            return true;
    }

    // Diagonales
    if (tablero[0][0] != 0 &&
            tablero[0][0] == tablero[1][1] &&
            tablero[0][0] == tablero[2][2])
        return true;

    if (tablero[0][2] != 0 &&
            tablero[0][2] == tablero[1][1] &&
            tablero[0][2] == tablero[2][0])
        return true;

    return false;
}

private void marcarPosicion(char posFila, int posColumna) {
    int valor = (jugador == 'x') ? 1 : 2;
    tablero[posFila - 'A'][posColumna] = valor;
}

private boolean esEscribible(char posFila, int posColumna) {
    if (sobreescribir) return true;

    return tablero[posFila - 'A'][posColumna] == 0;
}

private void pintarTablero() {
    IO.print("    ");

    for (int i = 0; i < 3; i++) {
        IO.print((i + 1) + " ");
    }

    IO.println();

    for (int i = 0; i < tablero.length; i++) {
        IO.print((char) (i + 'A') + " [ ");

        for (int j = 0; j < tablero[i].length; j++) {
            IO.print(
                    switch (tablero[i][j]) {
                        case 1  -> "X ";
                        case 2  -> "O ";
                        default -> "  ";
                    }
            );
        }

        IO.println("]");
    }
}

void main() {
    while (true) {
        IO.println("¿Te gustaría que se pueda sobreescribir casillas? (s/n)");
        char opcion = IO.readln().toLowerCase().charAt(0);

        if (opcion == 's') {
            sobreescribir = true;
            break;
        }

        if (opcion == 'n') {
            sobreescribir = false;
            break;
        }
    }

    pintarTablero();

    do {
        IO.println("\nTurno de " + Character.toUpperCase(jugador));

        IO.print("Indica dónde quieres marcar (Ejemplo: A 1): ");

        String[] coordenadas = IO.readln().toUpperCase().split(" ");

        while (
                coordenadas.length != 2 ||
                        !"ABC".contains(coordenadas[0]) ||
                        !coordenadas[1].matches("[1-3]") ||
                        !esEscribible(coordenadas[0].charAt(0), Integer.parseInt(coordenadas[1]) - 1)
        ) {
            IO.print("Introduce una posición válida: ");
            coordenadas = IO.readln().toUpperCase().split(" ");
        }

        char fila = coordenadas[0].charAt(0);
        int columna = Integer.parseInt(coordenadas[1]) - 1;

        marcarPosicion(fila, columna);

        if (!sobreescribir) jugadasRestantes--;

        pintarTablero();

        if (hayGanador()) {
            ganador = Character.toUpperCase(jugador);
            IO.println("\nEl jugador " + ganador + " ha GANADO!!");
            return;
        }

        jugador = jugador == 'x' ? 'o' : 'x';

    } while (jugadasRestantes > 0);

    IO.println("\nEs un EMPATE!!");
}