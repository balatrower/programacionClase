package DAM2_AccesoDatos.Introduccion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DividirFrasePorSeparador {
    void main() {
        IO.print("Introduce una cadena: ");
        String entrada = IO.readln();

        String[] palabras = entrada.split(" ");

        IO.println("Respuesta: ");
        for (String palabra : palabras) {
            IO.println(palabra);
        }

    }
}
