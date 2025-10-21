package ProgramacionClase;

public class E025ADIVINARELNUMERO {
    void main() {
        int numeroSecreto = Integer.parseInt(IO.readln("Introduce el numero secreto: "));

        for (int i = 1; i <= 50; i++) {
            IO.println("");
        }

        while (true) {
            int numero = Integer.parseInt(IO.readln("Introduce un numero: "));

            if (numero == numeroSecreto) {
                break;
            }

            if (numero > numeroSecreto) {
                IO.println("El numero escrito es mayor que el numero secreto");
            }

            if (numero < numeroSecreto) {
                IO.println("El numero escrito es menor que el numero secreto");
            }

            if (numero > numeroSecreto - 3 && numero < numeroSecreto + 3) {
                IO.println("Estas cerca del numero secreto!");
            }
        }

        IO.println("Felicidades en acertar el numero secreto!!!");
    }
}