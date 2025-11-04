void main() {
    //dibujarCuadradoHueco(pedirNumeroPositivoConControlDeErrores());
    dibujarRectanguloHueco(pedirNumeroPositivoConControlDeErrores(), pedirNumeroPositivoConControlDeErrores());
}

int pedirNumeroPositivoConControlDeErrores() {
    int numeroPedido = 0;
    while (numeroPedido <= 0) {
        try {
            numeroPedido = Integer.parseInt(IO.readln("Introduce un numero que no sea negativo: "));
        } catch (Exception enrique) {
            IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
        }
    }
    return numeroPedido;
}

void imprimirAsteriscosSinNuevaLinea(int cantidadAsteriscos) {
    for (int i = 1; i <= cantidadAsteriscos; i++) {
        IO.print("*");
    }
}

void imprimirEspaciosSinNuevaLinea(int cantidadEspacio) {
    for (int i = 1; i <= cantidadEspacio; i++) {
        IO.print(" ");
    }
}

void dibujarCuadradoRelleno(int tamanyoFigura) {
    for (int i = 1; i <= tamanyoFigura; i++) {
        imprimirAsteriscosSinNuevaLinea(tamanyoFigura);
        IO.println();
    }
}

void dibujarCuadradoHueco(int tamanyoFigura) {
    imprimirAsteriscosSinNuevaLinea(tamanyoFigura);
    IO.println();
    for (int i = 1; i <= tamanyoFigura - 2; i++) {
        IO.print("*");
        imprimirEspaciosSinNuevaLinea(tamanyoFigura - 2);
        IO.print("*");
        IO.println();
    }
    imprimirAsteriscosSinNuevaLinea(tamanyoFigura);
    IO.println();
}

void dibujarRectanguloRelleno(int anchoFigura, int largoFigura) {
    for (int i = 1; i <= anchoFigura; i++) {
        imprimirAsteriscosSinNuevaLinea(largoFigura);
        IO.println();
    }
}

void dibujarRectanguloHueco(int anchoFigura, int largoFigura) {
    imprimirAsteriscosSinNuevaLinea(largoFigura);
    IO.println();
    for (int i = 1; i <= anchoFigura - 2; i++) {
        IO.print("*");
        imprimirEspaciosSinNuevaLinea(largoFigura - 2);
        IO.print("*");
        IO.println();
    }
    imprimirAsteriscosSinNuevaLinea(largoFigura);
    IO.println();
}