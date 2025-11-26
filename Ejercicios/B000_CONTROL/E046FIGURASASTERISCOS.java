package B000_CONTROL;

public class E046FIGURASASTERISCOS {
    void main() {
        int idFiguraADibujar = 0;
        while (idFiguraADibujar <= 0 || idFiguraADibujar >= 4) {
            try {
                idFiguraADibujar = Integer.parseInt(IO.readln("Elije el tipo de figura a dibujar: \n Cuadrado (1) \n Rectangulo (2) \n Triangulo (3) \n - "));
            } catch (Exception enrique) {
                IO.println("No se admiten letras ni numeros fuera de los ids establecidos.");
            }
        }

        IO.println();

        switch (idFiguraADibujar) {
            case 1 -> {
                IO.println("Tamaño del cuadrado:");
                int tamanyoCuadrado = pedirNumeroPositivoConControlDeErrores();

                char rellenoChar = 'a';
                while (rellenoChar != 'r' && rellenoChar != 'h') {
                    String rellenoString = IO.readln("Figura rellena o hueca (R/H) ");
                    rellenoChar = rellenoString.toLowerCase().charAt(0);
                }

                IO.println();

                if (rellenoChar == 'r') {
                    dibujarCuadradoRelleno(tamanyoCuadrado);
                } else {
                    dibujarCuadradoHueco(tamanyoCuadrado);
                }
            }

            case 2 -> {
                IO.println("Ancho del Rectangulo");
                int anchoRectangulo = pedirNumeroPositivoConControlDeErrores();

                IO.println("Largo del Rectangulo");
                int largoRectangulo = pedirNumeroPositivoConControlDeErrores();

                char rellenoChar = 'a';
                while (rellenoChar != 'r' && rellenoChar != 'h') {
                    String rellenoString = IO.readln("Figura rellena o hueca (R/H) ");
                    rellenoChar = rellenoString.toLowerCase().charAt(0);
                }

                IO.println();

                if (rellenoChar == 'r') {
                    dibujarRectanguloRelleno(anchoRectangulo, largoRectangulo);
                } else {
                    dibujarRectanguloHueco(anchoRectangulo, largoRectangulo);
                }
            }

            case 3 -> {
                IO.println("Base del triangulo");
                int baseTriangulo = pedirNumeroPositivoConControlDeErrores();

                IO.println("Alto del triangulo");
                int altoTriangulo = pedirNumeroPositivoConControlDeErrores();

                char rellenoChar = 'a';
                while (rellenoChar != 'r' && rellenoChar != 'h') {
                    String rellenoString = IO.readln("Figura rellena o hueca (R/H) ");
                    rellenoChar = rellenoString.toLowerCase().charAt(0);
                }

                IO.println();

                if (rellenoChar == 'r') {
                    dibujarTrianguloRectanguloRelleno(baseTriangulo, altoTriangulo);
                } else {
                    dibujarTrianguloRectanguloHueco(baseTriangulo, altoTriangulo);
                }
            }
        }
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

    void dibujarTrianguloRectanguloRelleno(int baseTriangulo, int altoTriangulo) {
        double pendienteTriangulo = (double) baseTriangulo / altoTriangulo;

        double desplazamientoHorizontal = 0.0;
        for (int i = 1; i <= altoTriangulo; i++) {
            desplazamientoHorizontal += pendienteTriangulo;
            int desplazamientoHorizontalRedondeado = (int) Math.round(desplazamientoHorizontal);
            imprimirAsteriscosSinNuevaLinea(desplazamientoHorizontalRedondeado);
            IO.println();
        }
    }

    void dibujarTrianguloRectanguloHueco(int baseTriangulo, int altoTriangulo) {
        double pendienteTriangulo = (double) baseTriangulo / altoTriangulo;

        double desplazamientoHorizontal = 0.0;
        for (int i = 1; i <= altoTriangulo; i++) {
            desplazamientoHorizontal += pendienteTriangulo;
            int desplazamientoHorizontalRedondeado = (int) Math.round(desplazamientoHorizontal);

            if (desplazamientoHorizontalRedondeado <= 2) {
                imprimirAsteriscosSinNuevaLinea(desplazamientoHorizontalRedondeado);
            } else if (i == altoTriangulo) {
                imprimirAsteriscosSinNuevaLinea(baseTriangulo);
            } else {
                imprimirAsteriscosSinNuevaLinea(1);
                imprimirEspaciosSinNuevaLinea(desplazamientoHorizontalRedondeado - 2);
                imprimirAsteriscosSinNuevaLinea(1);
            }
            IO.println();
        }
    }
}