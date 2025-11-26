package B100_ARRAYS;

public class E104SUMATOTAL {
    void main() {
        IO.println("Cantidad de numeros para calcular su suma total: ");
        int cantidadNumeros = pedirNumeroPositivoEnteroConControlDeErrores();

        int[] numeros = new int[cantidadNumeros];

        IO.println("Añadir numeros para calcular su suma total: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            IO.println("Numeros restantes: " + (cantidadNumeros - i));
            numeros[i] = pedirNumeroPositivoEnteroConControlDeErrores();
        }

        int sumaTotal = 0;
        for (int numeroActual : numeros) {
            sumaTotal = sumaTotal + numeroActual;
        }

        IO.println("Suma total: " + sumaTotal);
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
