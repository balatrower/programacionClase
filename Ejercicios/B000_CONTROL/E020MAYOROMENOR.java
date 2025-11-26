package B000_CONTROL;

public class E020MAYOROMENOR {
    void main() {
        IO.println("Introduzca valores positivos y le diré si son menores o mayores, o iguales, que el anterior; o introduzca 0 para terminar:");
        int valorOg = Integer.parseInt(IO.readln("Primer valor: "));

        while (true) {
            int valorNuevo = Integer.parseInt(IO.readln("Introduzca valor: "));

            if (valorNuevo == 0) {
                IO.println("Saliendo...");
                break;
            }

            if (valorOg < valorNuevo) {
                IO.println("Es mayor que el anterior.");
                valorOg = valorNuevo;
                continue;
            }

            if (valorOg > valorNuevo) {
                IO.println("Es menor que el anterior.");
                valorOg = valorNuevo;
                continue;
            }

            IO.println("Es igual que el anterior");
            valorOg = valorNuevo;
        }
    }
}
