void main() {
    String fraseAdivinar = IO.readln("Introduce la palabra o frase que el jugador dos intentara adivinar: ");

    char[] fraseCaracteres = new char[fraseAdivinar.length()];
    for (int i = 0; i < fraseCaracteres.length; i++) {
            fraseCaracteres[i] = fraseAdivinar.charAt(i);
    }

    IO.println("\n\n\n\n\n\n\n");

    char[] caracteresAcertadosActualmente = fraseCaracteres.clone();
    formatearArray(caracteresAcertadosActualmente);
    int numFallos = 0;
    do {
        IO.println(Arrays.toString(caracteresAcertadosActualmente));
        char caracterActual = recibirInputCaracterSanitizado();

        if (verificarSiEstaEnLaFrase(caracterActual, fraseCaracteres)) {
            int[] posicionesLetraAdivinada = averiguarPosicionEnArray(caracterActual, fraseCaracteres);
            actualizarArrayCaracteresAcertados(caracteresAcertadosActualmente, posicionesLetraAdivinada, caracterActual);

            if (Arrays.equals(caracteresAcertadosActualmente, fraseCaracteres)) {
                IO.println(); //spacing
                break;
            }
        } else {
            numFallos++;
            imprimirStickmanNumeroFallos(numFallos);
        }
    } while (numFallos < 6);

    if (numFallos == 6) {
        IO.println("Que pena has perdido... La frase/palabra era: " + fraseAdivinar);
    } else {
        IO.println("ENHORABUENA HAS GANADO LA COPA AMERICA!!!! La frase/palabra era: " + fraseAdivinar);
    }
}

char recibirInputCaracterSanitizado() {
    char caracterDado = 'z';
    String stringSacarCaracter = " ";
    do {
            stringSacarCaracter = IO.readln("Introduce un caracter para saber si esta en la frase: ");

            if (!stringSacarCaracter.isBlank()) {
                caracterDado = stringSacarCaracter.charAt(0);
            }
    } while (caracterDado == 'z');
    return caracterDado;
}

void formatearArray(char[] arrayObjetivo) {
    for (int i = 0; i < arrayObjetivo.length; i++) {
        if (!Character.isWhitespace(arrayObjetivo[i])) {
            arrayObjetivo[i] = '_';
        }
    }
}

void actualizarArrayCaracteresAcertados(char[] arrayCaracteresAcertados, int[] posicionesLetraAdivinada, char letra) {
    int vecesPosicionActualizada = 0;
    for (int i = 0; i < arrayCaracteresAcertados.length; i++) {
        if (i == posicionesLetraAdivinada[vecesPosicionActualizada]) {
            arrayCaracteresAcertados[i] = letra;

            if (posicionesLetraAdivinada.length > 1 && posicionesLetraAdivinada.length != vecesPosicionActualizada + 1) {
                vecesPosicionActualizada++;
            }
        }
    }
}

int[] averiguarPosicionEnArray(char caracterBuscado, char[] fraseObjetivo) {
    int[] posicionesDentroArray;
    int contadorApariciones = 0;
    for (char caracterActual : fraseObjetivo) {
        if (caracterBuscado == caracterActual) {
            contadorApariciones++;
        }
    }

    posicionesDentroArray = new int[contadorApariciones];

    int vecesLetraEncontrada = 0;
    for (int i = 0; i < fraseObjetivo.length; i++) {
        if (caracterBuscado == fraseObjetivo[i]) {
            posicionesDentroArray[vecesLetraEncontrada] = i;
            vecesLetraEncontrada++;
        }
    }
    return posicionesDentroArray;
}

boolean verificarSiEstaEnLaFrase(char caracterBuscado, char[] fraseObjetivo) {
    for (char caracterActual : fraseObjetivo) {
        if (caracterBuscado == caracterActual) {
            return true;
        }
    }
    return false;
}

void imprimirStickmanNumeroFallos(int numFallos) {
    System.out.println(" ____");

    switch (numFallos) {
        case 1 -> {
            System.out.println(" |  0");
            System.out.println(" |");
            System.out.println(" |");
        }
        case 2 -> {
            System.out.println(" |  0");
            System.out.println(" |  |");
            System.out.println(" |");
        }
        case 3 -> {
            System.out.println(" |  0");
            System.out.println(" | -|");
            System.out.println(" |");
        }
        case 4 -> {
            System.out.println(" |  0");
            System.out.println(" | -|-");
            System.out.println(" |");
        }
        case 5 -> {
            System.out.println(" |  0");
            System.out.println(" | -|-");
            System.out.println(" | /");
        }
        case 6 -> {
            System.out.println(" |  0");
            System.out.println(" | -|-");
            System.out.println(" | / \\ ");
        }
    }
    System.out.println("_|_");
    System.out.println();
}