package B100_ARRAYS;

public class E140CONTARCASOSDEUNALISTA {
    void main() {
        int[] buscados = {17, 23, 3};
        int[] lista = {8, 23, 30, 47, 17, 5, 17, 21, 2};

        int contadorCoincidencias = 0;
        for (int numeroActual : lista) {
            for (int numeroActualBuscado : buscados) {
                if (numeroActual == numeroActualBuscado) {
                    contadorCoincidencias++;
                    break;
                }
            }
        }

        IO.println("Se han encontrado los numeros buscados en la lista dada " + contadorCoincidencias + " veces");
    }
}
