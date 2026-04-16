package B800_VARIOS;

import java.io.*;
import java.util.Scanner;

public class E803DUPLICARVALORCONFICHEROS {
    void main() {
        File archivoEntrada = new File("Ejercicios/B800_VARIOS/E803/entrada.txt");
        File archivoSalida = new File("Ejercicios/B800_VARIOS/E803/salida.txt");

        Scanner entrada = null;
        PrintWriter salida = null;

        IO.println("Escribir el doble de cada valor de entrada.txt en salida.txt");
        try {
            entrada = new Scanner(new BufferedReader(new FileReader(archivoEntrada)));
            salida = new PrintWriter(new BufferedWriter(new FileWriter(archivoSalida)));

            while (entrada.hasNext()) {
                int numeroExtraido = Integer.parseInt(entrada.nextLine());
                IO.println("Leido de entrada.txt: " + numeroExtraido);

                numeroExtraido = numeroExtraido * 2;

                IO.println("Escribiendo " + numeroExtraido + " en salida.txt");
                salida.println(numeroExtraido);
            }
        } catch (IOException enrique) {
            enrique.printStackTrace();
        } catch (NumberFormatException enrique) {
            IO.println("ERROR: NUMERO NO VALIDO ENCONTRADO");
        } finally {
            if (entrada != null) entrada.close();
            if (salida != null) salida.close();
        }
    }
}
