package B200_ALGORITMICA;

import module java.base;

public class E202ORDENACIONBURBUJA {
    void main() {
        int[] conjuntoNumerosAOrdenar = {5, 8, 15, 20, 3, 8, 10, 7};
        IO.println("Array sin ordenar: \n" + Arrays.toString(conjuntoNumerosAOrdenar));
        IO.println("Array ordenado usando bubble sort: \n" + Arrays.toString(bubbleSort(conjuntoNumerosAOrdenar.clone())));
    }

    int[] bubbleSort(int[] arrayAOrdenar) {
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