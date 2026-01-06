package B200_ALGORITMICA;

import java.util.Arrays;

public class E206FIBONACCICONARRAY {
    void main() {
        int valorInicial1 = 0;
        int valorInicial2 = 1;

        int[] arraySucesionFibonacci = calcularSucessionFibonacciPrimeros30(valorInicial1, valorInicial2);
        IO.println(Arrays.toString(arraySucesionFibonacci));
    }

    public int[] calcularSucessionFibonacciPrimeros30(int valorInicial1, int valorInicial2) {
        int[] arrayValoresFibonacci = new int[30];
        arrayValoresFibonacci[0] = valorInicial1;
        arrayValoresFibonacci[1] = valorInicial2;

        for (int i = 2; i < 30; i++) {
            arrayValoresFibonacci[i] = arrayValoresFibonacci[i - 2] + arrayValoresFibonacci[i - 1];
        }

        return arrayValoresFibonacci;
    }
}