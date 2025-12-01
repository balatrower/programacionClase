package B100_ARRAYS;

public class E110COMPARARDOSARRAYS {
    void main() {
        //comparacion de arrays de ints
    /*
        No entiendo lo de si ponerlo en el mismo main se refiere a hacerlo como yo lo he hecho ya que el
        modo de comparar los arrays de ints y doubles son iguales solo cambiando los tipos de variables
        entonces es un poco copia pega pero como dijiste que tiene que estar en el mismo main en el enunciado
        del ejercicio pues yo cumplo con lo que dice
    */
        IO.println("Comparacion de arrays de ints: ");
        int[] numeros = {2, 5, 56, 6, 2, 97, 35, 56, 45, 46};
        int[] numeros2 = {3, 35, 45, 6, 7, 98, 334, 56};

        int[] arrayMasLargo = (numeros.length > numeros2.length) ? numeros : numeros2;
        int[] arrayMasCorto = (numeros.length < numeros2.length) ? numeros : numeros2;

        for (int i = 0; i < arrayMasLargo.length; i++) {
            int elementoArray1 = 0;
            int elementoArray2 = 0;

            if (i >= arrayMasCorto.length) {
                elementoArray1 = arrayMasLargo[i];
                IO.println("Solo hay un valor y es: " + elementoArray1);
            } else {
                elementoArray1 = arrayMasLargo[i];
                elementoArray2 = arrayMasCorto[i];

                String respuesta = "IGUAL";
                if (elementoArray1 > elementoArray2) {
                    respuesta = "MAYOR";
                } else if (elementoArray1 < elementoArray2) {
                    respuesta = "MENOR";
                }

                System.out.format("El elemento %d del primer arrray con valor %d es %s que el elemento %d del segundo array con valor %d.\n", i + 1, elementoArray1, respuesta, i + 1, elementoArray2);
            }
        }
        IO.println("\n");


        //comparacion de arrays double
        IO.println("Comparacion de arrays de doubles: ");
        double[] dobles = {2.4, 5.5, 56.46, 6.3333, 2.33, 97.14, 35.75, 56.15};
        double[] dobles2 = {3.35, 35.85, 45.64, 6.3333, 7.25, 98.001, 334.35, 56.14, 45.464, 46.6767};

        double[] arrayMasLargoDobles = (dobles.length > dobles2.length) ? dobles : dobles2;
        double[] arrayMasCortoDobles = (dobles.length < dobles2.length) ? dobles : dobles2;

        for (int i = 0; i < arrayMasLargoDobles.length; i++) {
            double elementoArray1 = 0;
            double elementoArray2 = 0;

            if (i >= arrayMasCortoDobles.length) {
                elementoArray1 = arrayMasLargoDobles[i];
                IO.println("Solo hay un valor y es: " + elementoArray1);
            } else {
                elementoArray1 = arrayMasLargoDobles[i];
                elementoArray2 = arrayMasCortoDobles[i];

                String respuesta = "IGUAL";
                if (elementoArray1 > elementoArray2) {
                    respuesta = "MAYOR";
                } else if (elementoArray1 < elementoArray2) {
                    respuesta = "MENOR";
                }

                System.out.format("El elemento %d del primer arrray con valor %f es %s que el elemento %d del segundo array con valor %f.\n", i + 1, elementoArray1, respuesta, i + 1, elementoArray2);
            }
        }
        IO.println("\n");


        //comparacion de arrays de booleans
        IO.println("Comparacion de arrays de booleans: ");
        boolean[] booleanos = {true, false, true, false, true, false, true, false};
        boolean[] booleanos2 = {true, true, true, false, false, false};

        boolean[] arrayMasLargoBooleanos = (booleanos.length > booleanos2.length) ? booleanos : booleanos2;
        boolean[] arrayMasCortoBooleanos = (booleanos.length < booleanos2.length) ? booleanos : booleanos2;

        for (int i = 0; i < arrayMasLargoBooleanos.length; i++) {
            boolean elementoArray1;
            boolean elementoArray2;

            if (i >= arrayMasCortoBooleanos.length) {
                elementoArray1 = arrayMasLargoBooleanos[i];
                IO.println("Solo hay un valor y es: " + elementoArray1);
            } else {
                elementoArray1 = arrayMasLargoBooleanos[i];
                elementoArray2 = arrayMasCortoBooleanos[i];

                String respuesta = "DISTINTO";
                if (elementoArray1 == elementoArray2) {
                    respuesta = "IGUAL";
                }

                System.out.format("El elemento %d del primer arrray con valor %b es %s que el elemento %d del segundo array con valor %b.\n", i + 1, elementoArray1, respuesta, i + 1, elementoArray2);
            }
        }
    }
}