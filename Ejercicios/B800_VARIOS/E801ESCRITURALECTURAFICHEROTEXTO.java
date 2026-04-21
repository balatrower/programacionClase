package B800_VARIOS;

import java.io.*;
import java.util.Scanner;

public class E801ESCRITURALECTURAFICHEROTEXTO {
    void main() {
        IO.println("Escritura de los datos a el archivo datos.txt");
        File rutaArchivo = new File("Ejercicios/B800_VARIOS/E801/datos.txt");
        PrintWriter salida = null;

        try {
            salida = new PrintWriter(new BufferedWriter(new FileWriter(rutaArchivo)));
            for (int i = 1; i <= 10; i++) {
                IO.println("Escribiendo el numero " + i + " en datos.txt...");
                salida.println(i);
            }
        } catch (IOException enrique) {
            enrique.printStackTrace();
        } finally {
            if (salida != null) salida.close();
        }

        IO.println();
        IO.println("Lectura de los datos del archivo datos.txt");
        Scanner entrada = null;

        try {
            entrada = new Scanner(new BufferedReader(new FileReader(rutaArchivo)));
            while (entrada.hasNext()) {
                String cadena = entrada.nextLine();
                IO.println("Leido de datos.txt: " + cadena);
            }
        } catch (IOException enrique) {
            enrique.printStackTrace();
        } finally {
            if (entrada != null) entrada.close();
        }
    }
}
