package ProgramacionClase;

public class E036DETECTARREPETICIONES {
    void main() {

        int cantidadNecesaria = Integer.parseInt(IO.readln("Introduce la cantidad de veces que hay que escribir numeros seguidos para parar el programa: "));

        while (cantidadNecesaria <= 0) {
            cantidadNecesaria = Integer.parseInt(IO.readln("Como minimo la cantidad debe ser 1, no menos, introduce un numero: "));
        }

        int numeroOriginal = Integer.parseInt(IO.readln("Introduce un numero: "));

        IO.println("Si el numero nuevo a introducir es igual que el anterior numero introducido " + cantidadNecesaria + " veces se sale del bucle");
        int cantidadActual = 1;
        int numeroNuevo;
        while (cantidadNecesaria != cantidadActual) {
            numeroNuevo = Integer.parseInt(IO.readln("Introduce un numero: "));

            if (numeroOriginal == numeroNuevo) {
                cantidadActual++;
            } else {
                cantidadActual = 1;
            }

            numeroOriginal = numeroNuevo;
        }

        IO.println("¡Los numeros fueron iguales " + cantidadNecesaria + " veces !");
    }
}