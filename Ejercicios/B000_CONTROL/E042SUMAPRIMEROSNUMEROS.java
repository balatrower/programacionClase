package B000_CONTROL;

public class E042SUMAPRIMEROSNUMEROS {
    void main() {
        int numeroObjetivo = pedirNumeroPositivoConControlDeErrores();

        //esto se puede resolver usando la formula de Gauss de la suma de los primeros N numeros naturales
        //suma = N * (N + 1) / 2
        int suma = numeroObjetivo * (numeroObjetivo + 1) / 2;

        System.out.format("La suma de el numero 1 hasta el numero %d es %d", numeroObjetivo, suma);
    }

    int pedirNumeroPositivoConControlDeErrores() {
        int numeroPedido = 0;
        while (numeroPedido <= 0) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero positivo entero: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}