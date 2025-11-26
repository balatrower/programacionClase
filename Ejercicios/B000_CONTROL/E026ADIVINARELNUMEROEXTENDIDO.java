package B000_CONTROL;

import java.util.Scanner;
import java.util.Random;

public class E026ADIVINARELNUMEROEXTENDIDO {
    void main() {
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);
        IO.println("Configuracion inicial del juego.");

        System.out.print("Introduzca el número secreto o escribe 'random' para usar un numero aleatorio: ");
        String numSecretoString = teclado.nextLine();
        int numSecreto = 0;

        if (numSecretoString.equalsIgnoreCase("random")) {
            numSecreto = rand.nextInt(100000) + 1;
        } else {
            numSecreto = Integer.parseInt(numSecretoString);
        }

        // Comprobación de la entrada, por si no es válida.
        while (numSecreto <= 0) {
            System.out.println("No se admiten valores negativos ni cero, introduzca otro número: ");
            System.out.print("Introduzca el número secreto: ");
            numSecreto = teclado.nextInt();
        }

        System.out.print("Introduzca el número maximo de intentos: ");
        int numMaxIntentos = teclado.nextInt();

        // Comprobación de la entrada, por si no es válida.
        while (numMaxIntentos <= 0) {
            System.out.println("No se admiten valores negativos ni cero, introduzca otro número: ");
            System.out.print("Introduzca el número maximo de intentos: ");
            numMaxIntentos = teclado.nextInt();
        }

        // El núm. secreto en este punto es != 0.


        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        int contadorIntentos = 1;
        int numIntentado;
        do {
            IO.println("Intento numero: " + contadorIntentos);
            System.out.println("Introduzca un número:");
            numIntentado = teclado.nextInt();

            int diferencia = Math.abs(numSecreto - numIntentado);

            if (diferencia <= 3) {
                System.out.println("Te quemas");
            } else if (diferencia <= 10) {
                System.out.println("Caliente");
            } else if (diferencia <= 25) {
                System.out.println("Templado ");
            } else {
                System.out.println("Frío");
            }

            IO.print("La diferencia en decenas es de: ");
            while (diferencia >= 10) {
                diferencia -= 10;
                IO.print("*");
            }
            IO.println("");

            if (numIntentado > numSecreto) System.out.println("El número es más pequeño.\n");
            if (numIntentado < numSecreto) System.out.println("El número es mas grande.\n");

            if (contadorIntentos == numMaxIntentos) {
                break;
            }

            contadorIntentos++;
        } while (numIntentado != numSecreto);

        if (numIntentado == numSecreto) {
            System.out.println("Muy bien, ¡has acertado! El número secreto era: " + numSecreto);
        } else {
            System.out.println("Que pena, no conseguiste acertarlo. El número secreto era: " + numSecreto);
        }
    }
}