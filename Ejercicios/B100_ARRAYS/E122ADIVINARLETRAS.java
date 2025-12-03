void main() {
    IO.println("Introduce numero de letras con el que se jugara: ");
    int numeroLetrasSecretas = pedirNumeroPositivoMayorQueUnoConControlDeErrores();

    char[] letrasSecretas = new char[numeroLetrasSecretas];
    for (int i = 0; i < numeroLetrasSecretas; i++) {
        IO.println("Quedan " + (numeroLetrasSecretas - i) + " por introducir");
        letrasSecretas[i] = IO.readln("Introduce una letra: ").charAt(0);
    }

    IO.println("\n\n\n\n\n\n\n\n");

    boolean[] respuestasCorrectas = new boolean[numeroLetrasSecretas];
    do {

    } while ();
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