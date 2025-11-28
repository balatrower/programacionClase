package B100_ARRAYS;

public class E106MAYORYMENOR {
    void main() {
        IO.println("Cantidad de numeros del array: ");
        int cantidadNumeros = pedirNumeroPositivoEnteroConControlDeErrores();
        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            IO.println("Numeros a añadir restantes: " + (cantidadNumeros - i));
            int numero = pedirNumeroPositivoEnteroConControlDeErrores();
            numeros[i] = numero;
        }

        int menor = numeros[0];
        int mayor = numeros[0];
        for (int numeroActual : numeros) {
            if (numeroActual < menor) {
                menor = numeroActual;
            } else if (numeroActual > mayor) {
                mayor = numeroActual;
            }
        }

        IO.println();
        System.out.format("El numero menor del conjunto dado anteriormente es %d y el mayor es %d", menor, mayor);
    }

    int pedirNumeroPositivoEnteroConControlDeErrores() {
        int numeroPedido = 0;
        while (numeroPedido <= 0) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}

