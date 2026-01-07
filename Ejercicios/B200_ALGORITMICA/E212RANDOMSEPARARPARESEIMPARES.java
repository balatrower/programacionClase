package B200_ALGORITMICA;

import java.util.Arrays;

public class E212RANDOMSEPARARPARESEIMPARES {
    void main() {
        int[] arrayNumerosAleatorios = new int[20];
        for (int i = 0; i < 20; i++) {
            arrayNumerosAleatorios[i] = (int) (Math.random() * (100 - 1 + 1)) + 1;
        }

        int cantidadPares = sacarCantidadNumerosParesEnArray(arrayNumerosAleatorios);
        int cantidadImpares = sacarCantidadNumerosImparesEnArray(arrayNumerosAleatorios);
        int[] arrayNumerosPares = new int[cantidadPares];
        int[] arrayNumerosImpares = new int[cantidadImpares];

        int posicionPares = 0;
        int posicionImpares = 0;
        for (int numeroActual : arrayNumerosAleatorios) {
            if (numeroActual % 2 == 0) {
                arrayNumerosPares[posicionPares] = numeroActual;
                posicionPares++;
            } else {
                arrayNumerosImpares[posicionImpares] = numeroActual;
                posicionImpares++;
            }
        }

        IO.println("Array todos los numeros: " + Arrays.toString(arrayNumerosAleatorios));
        IO.println("Array Pares: " + Arrays.toString(arrayNumerosPares));
        IO.println("Array Impares " + Arrays.toString(arrayNumerosImpares));
    }

    public int sacarCantidadNumerosImparesEnArray(int[] array) {
        int cantidadNumeros = 0;
        for (int numeroActual : array) {
            if (numeroActual % 2 != 0) {
                cantidadNumeros++;
            }
        }
        return cantidadNumeros;
    }

    public int sacarCantidadNumerosParesEnArray(int[] array) {
        int cantidadNumeros = 0;
        for (int numeroActual : array) {
            if (numeroActual % 2 == 0) {
                cantidadNumeros++;
            }
        }
        return cantidadNumeros;
    }
}