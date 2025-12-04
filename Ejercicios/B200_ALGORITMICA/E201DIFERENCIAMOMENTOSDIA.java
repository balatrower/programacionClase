package B200_ALGORITMICA;

public class E201DIFERENCIAMOMENTOSDIA {
    void main() {
        IO.println("Introduce una hora para compararla con otra.");

        IO.println("Horas: ");
        int horas1 = pedirNumeroHoras();

        IO.println("Minutos: ");
        int minutos1 = pedirNumeroMinutos();

        IO.println("Introduce la otra hora: ");
        IO.println("Horas: ");
        int horas2 = pedirNumeroHoras();

        IO.println("Minutos: ");
        int minutos2 = pedirNumeroMinutos();

        int horasDiferecia = Math.abs(horas1 - horas2);
        int minutosDiferencia = Math.abs(minutos1 - minutos2);

        System.out.printf("La diferencia es de %02d:%02d.", horasDiferecia, minutosDiferencia);
    }

    int pedirNumeroHoras() {
        int numeroPedido = -1;
        while (numeroPedido < 0 || numeroPedido >= 24) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }

    int pedirNumeroMinutos() {
        int numeroPedido = -1;
        while (numeroPedido < 0 || numeroPedido >= 60) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}