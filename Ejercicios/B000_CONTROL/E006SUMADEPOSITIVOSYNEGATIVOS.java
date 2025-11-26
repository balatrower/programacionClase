package B000_CONTROL;

public class E006SUMADEPOSITIVOSYNEGATIVOS {
    void main() {
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contador = 0;
        while (true) {
            int numero = Integer.parseInt(IO.readln("Introduce un numero: "));

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                sumaPositivos += numero;
                if (numero % 2 == 0) {
                    sumaPares += numero;

                }

                if (numero % 2 == 1) {
                    sumaImpares += numero;
                }
            }

            if (numero < 0) {
                sumaNegativos += numero;
            }

            contador++;
        }

        IO.println();
        System.out.format("Suma postivos: %d\n", sumaPositivos);
        System.out.format(" Suma postivos pares: %d\n", sumaPares);
        System.out.format(" Suma postivos impares: %d\n", sumaImpares);
        System.out.format("Suma negativos: %d\n", sumaNegativos);
        System.out.format("Total numeros: %d\n", contador);
    }
}