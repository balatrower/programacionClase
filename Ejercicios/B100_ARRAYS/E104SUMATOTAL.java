package B100_ARRAYS;

public class E104SUMATOTAL {
    void main() {
        IO.println("Cantidad de numeros para calcular su suma total: ");
        int cantidadNumeros;
        do {
            cantidadNumeros = pedirNumeroPositivoEnteroConControlDeErrores();
        } while (cantidadNumeros <= 0);

        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = i + 1;
        }

        int sumaTotal = 0;
        for (int numeroActual : numeros) {
            sumaTotal = sumaTotal + numeroActual;
        }

        IO.println("Suma total: " + sumaTotal);
        IO.println("Verificacion con formula de Gauss: " + cantidadNumeros * (cantidadNumeros + 1) / 2);
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