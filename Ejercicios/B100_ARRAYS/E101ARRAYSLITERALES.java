package B100_ARRAYS;

public class E101ARRAYSLITERALES {
    void main() {
        int[] numeros = {17, 23, 5, 21};
        double[] longitudes = {11.36, 0.0, 1.184, -3.98, 1495739.2};
        boolean[] indicadores = {false, false, true, false, true};

        IO.println("Array numeros: ");
        for (int numeroActual : numeros) {
            IO.println(numeroActual);
        }
        IO.println();

        IO.println("Array longitudes: ");
        for (double longitudActual : longitudes) {
            IO.println(longitudActual);
        }
        IO.println();

        IO.println("Array indicadores: ");
        for (boolean indicadorActual : indicadores) {
            IO.println(indicadorActual);
        }
        IO.println();
    }
}