package B100_ARRAYS;

import module java.base;

public class E130AHORCADO {
    void main() {
        String fraseAdivinar = recibirInputStringSanitizado();

        char[] fraseCaracteres = new char[fraseAdivinar.length()]; //convertir string a array caracteres
        for (int i = 0; i < fraseCaracteres.length; i++) {
            fraseCaracteres[i] = fraseAdivinar.charAt(i);
        }

        IO.println("\n\n\n\n\n\n\n");

        char[] caracteresAcertadosActualmente = fraseCaracteres.clone(); //clonar para tener dos arrays iguales distintos
        formatearArray(caracteresAcertadosActualmente); //formatear el array de los caracteres acertados
        int numFallos = 0;
        do {
            IO.println(Arrays.toString(caracteresAcertadosActualmente));
            char caracterActual = recibirInputCaracterSanitizado();

            if (verificarSiEstaEnLaFrase(caracterActual, fraseCaracteres)) {
                //si está en la frase el caracter sacar posiciones de todas las letras iguales
                //en el array y actualizar el array vacia con las letras acertadas
                int[] posicionesLetraAdivinada = averiguarPosicionEnArray(caracterActual, fraseCaracteres);
                actualizarArrayCaracteresAcertados(caracteresAcertadosActualmente, posicionesLetraAdivinada, caracterActual);

                if (Arrays.equals(caracteresAcertadosActualmente, fraseCaracteres)) {
                    //chekear win condition, si el array vacia que se va rellenando es igual que el array de la frase
                    IO.println(); //spacing
                    break; //si se gana salir del bucle
                }
            } else {
                numFallos++;
                imprimirStickmanNumeroFallos(numFallos);
            }
        } while (numFallos < 6);

        if (numFallos == 6) {
            IO.println("Que pringao has perdido... La frase/palabra era: " + fraseAdivinar);
        } else {
            IO.println("ENHORABUENA HAS GANADO LA COPA SAXO!!!! La frase/palabra era: " + fraseAdivinar);
        }
    }

    String recibirInputStringSanitizado() {
        String inputUsuario;
        do {
            inputUsuario = IO.readln("Introduce la palabra o frase que el jugador dos intentara adivinar: ");
        } while (inputUsuario.isEmpty());
        return inputUsuario;
    }

    char recibirInputCaracterSanitizado() {
        char caracterDado = 'z';
        String stringSacarCaracter;
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
            if (!Character.isWhitespace(arrayObjetivo[i])) { //si no es espacio convertir a _
                arrayObjetivo[i] = '_';
            }
        }
    }

    void actualizarArrayCaracteresAcertados(char[] arrayCaracteresAcertados, int[] posicionesLetraAdivinada, char letra) {
        int vecesPosicionActualizada = 0;
        for (int i = 0; i < arrayCaracteresAcertados.length; i++) {
            if (i == posicionesLetraAdivinada[vecesPosicionActualizada]) { //si posicion es igual a donde esta la letra
                arrayCaracteresAcertados[i] = letra; //cambiar letra en array acertados

                if (posicionesLetraAdivinada.length > 1 && posicionesLetraAdivinada.length != vecesPosicionActualizada + 1) {
                    // si hay varias letras y no estamos en el final del array, pasa al indice de la posicion de la siguiente letra
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
                contadorApariciones++; //saber si hay 1 o varias letras iguales
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
}
