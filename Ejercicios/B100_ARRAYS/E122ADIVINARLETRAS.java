void main() {
    IO.println("Introduce numero de letras con el que se jugara: ");
    int numeroLetrasSecretas = pedirNumeroPositivoMayorQueUnoConControlDeErrores();

    char[] letrasSecretas = new char[numeroLetrasSecretas];
    for (int i = 0; i < numeroLetrasSecretas; i++) {
        IO.println("Quedan " + (numeroLetrasSecretas - i) + " por introducir");
        letrasSecretas[i] = IO.readln("Introduce una letra: ").charAt(0);
    }

    IO.println("\n\n\n\n\n\n\n\n");

    int contadorLetraActual = 0;
    boolean todasAcertadas = false;
    boolean[] letrasAcertadas = new boolean[numeroLetrasSecretas];
    IO.println("Comienzo de juego, a adivinar letras jugador 2!!");
    do {
        char letraIntroducida = IO.readln("Introduce letra para adivinar: ").charAt(0);
        if (verificarLetraExiste(letraIntroducida, letrasSecretas)) {
            if (contadorLetraActual == 0) {
                IO.println("Adivinaste una letra!!");
                letrasAcertadas[contadorLetraActual] = true;
                contadorLetraActual++;
            } else if (letrasSecretas[contadorLetraActual - 1] == letraIntroducida) {
                IO.println("Esa letra ya esta dicha");
            } else {
                IO.println("Adivinaste una letra!!");
                letrasAcertadas[contadorLetraActual] = true;
                contadorLetraActual++;
            }
        }

        todasAcertadas = verificarSiHaGanado(letrasAcertadas);
    } while (!todasAcertadas);
    IO.println("Ganaste colega!!!");
}

boolean verificarSiHaGanado(boolean[] arrayLetrasAcertadas) {
    int contadorAciertos = 0;
    for (int i = 0; i < arrayLetrasAcertadas.length - 1; i++) {
        if (arrayLetrasAcertadas[i]) {
            contadorAciertos++;
        }
    }
    return contadorAciertos == arrayLetrasAcertadas.length;
}

boolean verificarLetraExiste(char letra, char[] arrayLetras) {
    for (int i = 0; i < arrayLetras.length - 1; i++){
        if (arrayLetras[i] == letra) {
            return true;
        }
    }
    return false;
}

int pedirNumeroPositivoMayorQueUnoConControlDeErrores() {
    int numeroPedido = 0;
    while (numeroPedido <= 1) {
        try {
            numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
        } catch (Exception enrique) {
            IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
        }
    }
    return numeroPedido;
}