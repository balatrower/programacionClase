package B200_ALGORITMICA;

public class E208FIBONACCIN {
    public static final int N = 4; // El "tipo" de serie de Fibonacci, es decir, con cuántos números fijos comenzamos y cuántos sumamos cada vez.
    public static final int HASTA = 30; // Cuántos valores de esta serie queremos ver en la pantalla, en total.

    void main() {
        long[] arrayFibonacci = new long[HASTA];
        arrayFibonacci = cargarValoresInicialesAlArray(arrayFibonacci);

        imprimirFibonacciNUsandoArrayConValoresIniciales(arrayFibonacci);
    }

    public long[] cargarValoresInicialesAlArray(long[] arrayACargar) {
        for (int i = 0; i < N; i++) {
            if (i != N - 1) {
                arrayACargar[i] = 0;
            } else {
                arrayACargar[i] = 1;
            }
        }

        return arrayACargar;
    }

    public void imprimirFibonacciNUsandoArrayConValoresIniciales(long[] arrayConValoresIniciales) {
        //construccion array completo con digitos fibonacci
        for (int i = N; i < HASTA; i++) {
            long sumaValoresAnteriores = 0;
            for (int j = 0; j < N; j++) {
                sumaValoresAnteriores = sumaValoresAnteriores + arrayConValoresIniciales[j + i - N];
            }
            arrayConValoresIniciales[i] = sumaValoresAnteriores;
        }

        //imprimir por pantalla array con valores
        for (long valorActual : arrayConValoresIniciales) {
            IO.print(valorActual + " ");
        }
        IO.print("\n");
    }
}