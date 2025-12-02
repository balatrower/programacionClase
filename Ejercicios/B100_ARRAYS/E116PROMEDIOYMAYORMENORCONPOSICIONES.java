package B100_ARRAYS;

public class E116PROMEDIOYMAYORMENORCONPOSICIONES {
    void main() {
        IO.println("Introduce un numero que dictara la cantidad de numeros para leer despues: ");
        int cantidadNumeros = pedirNumeroPositivoMayorQueUnoConControlDeErrores();
        IO.println();

        IO.println("Introdouce los numeros enteros: ");
        int[] conjuntoNumeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            IO.println("Quedan " + (cantidadNumeros - i) + " numeros: ");
            conjuntoNumeros[i] = pedirNumeroPositivoMayorQueUnoConControlDeErrores();
        }
        IO.println();

        double sumaTotal = 0;
        int posMayor = 1;
        int posMenor = 1;
        int valorMayor = conjuntoNumeros[0];
        int valorMenor = conjuntoNumeros[0];
        for (int i = 0; i < cantidadNumeros; i++) {
            sumaTotal = sumaTotal + conjuntoNumeros[i];

            if (conjuntoNumeros[i] > valorMayor) {
                valorMayor = conjuntoNumeros[i];
                posMayor = i + 1;
            } else if (conjuntoNumeros[i] < valorMenor) {
                valorMenor = conjuntoNumeros[i];
                posMenor = i + 1;
            }
        }
        sumaTotal = sumaTotal / cantidadNumeros;

        IO.println("El promedio es: " + sumaTotal);
        System.out.format("El mayor era %d (posicion %d) y el menor era %d (posicion %d).", valorMayor, posMayor, valorMenor, posMenor);
    }

    int pedirNumeroPositivoMayorQueUnoConControlDeErrores() {
        int numeroPedido = 0;
        while (numeroPedido <= 1) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}