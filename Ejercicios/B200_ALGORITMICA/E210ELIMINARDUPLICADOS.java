package B200_ALGORITMICA;

import module java.base;

public class E210ELIMINARDUPLICADOS {
    void main() {
        int[] arrayNumeros = {2, 10, 4, 10, 8, 5, 5, 10, 17, 2};
        arrayNumeros = eliminarNumerosDuplicados(arrayNumeros);

        IO.println(Arrays.toString(arrayNumeros));
    }

    public int[] eliminarNumerosDuplicados(int[] arrayATratar) {
        arrayATratar = bubbleSort(arrayATratar);
        int cantidadNumerosDistintos = sacarCantidadNumerosDistintosEnArray(arrayATratar);

        int[] arraySinDuplicados = new int[cantidadNumerosDistintos];
        int indiceNumeroAnyadidoNoDuplicado = 0;
        for (int i = 0; i < arrayATratar.length; i++) {
            if (i == 0) {
                continue;
            }

            int numeroActual = arrayATratar[i];
            int numeroAnterior = arrayATratar[i - 1];

            if (numeroActual != numeroAnterior) {
                arraySinDuplicados[indiceNumeroAnyadidoNoDuplicado] = numeroAnterior;
                indiceNumeroAnyadidoNoDuplicado++;

                //lo hice de tal manera que es necesario esto para el edge case de que haya dos numeros finales
                //seguidos en el array ya ordenado y aunque no los haya tambien;
                if (i == arrayATratar.length - 1) {
                    arraySinDuplicados[indiceNumeroAnyadidoNoDuplicado] = numeroActual;
                }
            } else if (i == arrayATratar.length - 1) {
                arraySinDuplicados[indiceNumeroAnyadidoNoDuplicado] = numeroActual;
            }
        }
        return arraySinDuplicados;
    }

    private static int sacarCantidadNumerosDistintosEnArray(int[] arrayATratar) {
        int cantidadNumerosDistintos = 1;
        for (int i = 0; i < arrayATratar.length; i++) {
            if (i == 0) {
                continue;
            }

            int numeroActual = arrayATratar[i];
            int numeroAnterior = arrayATratar[i - 1];

            if (numeroActual != numeroAnterior) {
                cantidadNumerosDistintos++;
            }
        }
        return cantidadNumerosDistintos;
    }

    public int[] bubbleSort(int[] arrayAOrdenar) {
        for (int i = 1; i < arrayAOrdenar.length - 1; i++) {
            for (int j = 0; j < arrayAOrdenar.length - i; j++) {
                if (arrayAOrdenar[j] > arrayAOrdenar[j + 1]) {
                    int auxiliar = arrayAOrdenar[j];
                    arrayAOrdenar[j] = arrayAOrdenar[j + 1];
                    arrayAOrdenar[j + 1] = auxiliar;
                }
            }
        }
        return arrayAOrdenar;
    }
}