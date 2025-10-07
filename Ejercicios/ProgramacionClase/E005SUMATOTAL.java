package ProgramacionClase;

import java.lang.IO;

public class E005SUMATOTAL {
    void main() {
        IO.println("Cuantos numeros quieres sumar?");
        int numeroVeces = Integer.parseInt(IO.readln());

        IO.println("Introduzca los numeros a continuacion");

        int sumaTotal = 0;
        for (int i = 0; i < numeroVeces; i++) {
            int numero = Integer.parseInt(IO.readln());
            sumaTotal += numero;
        }

        IO.println("La suma da: " + sumaTotal);
        IO.println("La media es de: " + this.calcularMedia(sumaTotal, numeroVeces));
    }

    public int calcularMedia(int sumaNumeros, int cantidadNumeros) {
        return sumaNumeros / cantidadNumeros;
    }
}