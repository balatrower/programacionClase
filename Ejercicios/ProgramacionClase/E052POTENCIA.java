void main() {
    double base = pedirNumeroPositivoDecimalConControlDeErrores();
    int exponente = pedirNumeroPositivoEnteroConControlDeErrores();
    System.out.format("La potencia de %f elevado a %d es %f", base, exponente, calcularPotencia(base, exponente));
}

double calcularPotencia(double base, int exponente) {
    double resultado = 0;

    for (int i = 0; i < exponente; i++) {
        resultado = resultado + base;
    }

    return resultado;
}

double pedirNumeroPositivoDecimalConControlDeErrores() {
    double numeroPedido = 0;
    while (numeroPedido <= 0) {
        try {
            numeroPedido = Double.parseDouble(IO.readln("Introduce un numero que puede ser decimal que no sea negativo: "));
        } catch (Exception enrique) {
            IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
        }
    }
    return numeroPedido;
}

int pedirNumeroPositivoEnteroConControlDeErrores() {
    int numeroPedido = 0;
    while (numeroPedido <= 0) {
        try {
            numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero que no sea negativo: "));
        } catch (Exception enrique) {
            IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
        }
    }
    return numeroPedido;
}