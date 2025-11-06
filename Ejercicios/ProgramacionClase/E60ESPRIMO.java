void main() {
    boolean primo = esPrimo(pedirNumeroPositivoEnteroConControlDeErrores());

    if (primo) {
        IO.println("El numero escrito es primo");
    } else {
        IO.println("El numero escrito no es primo");
    }
}

boolean esDivisible(int dividendo, int divisor) {
    int resultadoDivisible = dividendo % divisor;
    //si es divisible devuelve true al ser un statement
    return resultadoDivisible == 0;
}

boolean esPrimo(int numero) {
    //empezar pensando que el numero es primo
    boolean primo = true;
    for (int i = 2; i < numero; i++) {
        if (esDivisible(numero, i)) {
            //si el numero es divisible entre otro que no sea el mismo, se cambia el ser primo a falso
            primo = false;
        }
    }
    return primo;
}

int pedirNumeroPositivoEnteroConControlDeErrores() {
    int numeroPedido = 0;
    while (numeroPedido <= 0) {
        try {
            numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
        } catch (Exception enrique) {
            IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
        }
    }
    return numeroPedido;
}