package B000_CONTROL;

public class E035OLAS {
    void main() {
        int numOlas = Integer.parseInt(IO.readln("Indique numero maximo de olas: "));

        int anchoOlas = Integer.parseInt(IO.readln("Indique amplitud maxima: "));

        boolean inversidad = false;
        String inversoString = IO.readln("¿Olas inversas? (y/n) ");

        if (inversoString.equalsIgnoreCase("y")) {
            inversidad = true;
        }


        for (int i = 0; i < numOlas; i++) {
            imprimirOla(anchoOlas, inversidad);
        }
    }

    void imprimirOla(int anchoOla, boolean inversidad) {
        imprimirTriangulo(anchoOla, inversidad);
        imprimirTrianguloInverso(anchoOla - 1, inversidad);
    }

    void imprimirTriangulo(int ancho, boolean contieneEspacios) {
        if (contieneEspacios) {
            for (int i = 1; i <= ancho; i++) {
                imprimirEspacios(ancho - i);
                imprimirAsteriscos(i);
            }
        } else {
            for (int i = 1; i <= ancho; i++) {
                imprimirAsteriscos(i);
            }
        }
    }

    void imprimirTrianguloInverso(int ancho, boolean contieneEspacios) {
        if (contieneEspacios) {
            for (int i = ancho; i >= 0; i--) {
                imprimirEspacios(ancho + 1 - i);
                imprimirAsteriscos(i);
            }
        } else {
            for (int i = ancho; i >= 0; i--) {
                imprimirAsteriscos(i);
            }
        }
    }

    void imprimirAsteriscos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            IO.print("*");
        }
        IO.println("");
    }

    void imprimirEspacios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            IO.print(" ");
        }
    }
}