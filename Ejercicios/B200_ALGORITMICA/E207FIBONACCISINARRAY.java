package B200_ALGORITMICA;

public class E207FIBONACCISINARRAY {
    void main() {
        int valorInicial1 = 0;
        int valorInicial2 = 1;

        imprimirPrimerosTreintaNumerosFibonacci(valorInicial1, valorInicial2);
    }

    public void imprimirPrimerosTreintaNumerosFibonacci(int valor1, int valor2) {
        IO.print(valor1 + " " + valor2);
        for (int i = 2; i < 30; i++) {
            int valorCalculadoActual = valor1 + valor2;
            valor1 = valor2;
            valor2 = valorCalculadoActual;

            IO.print(" " + valorCalculadoActual);
        }
        IO.print("\n");
    }
}