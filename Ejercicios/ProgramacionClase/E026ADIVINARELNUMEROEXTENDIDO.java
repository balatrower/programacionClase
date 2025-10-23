package ProgramacionClase;

import java.util.Scanner;

public class E026ADIVINARELNUMEROEXTENDIDO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el número secreto: ");
        int numSecreto = teclado.nextInt();

        // Comprobación de la entrada, por si no es válida.
        while (numSecreto <= 0) {
            System.out.println ("No se admiten valores negativos ni cero, introduzca otro número: ");
            System.out.print ("Introduzca el número secreto: ");
            numSecreto = teclado.nextInt();
        }

        // El núm. secreto en este punto es != 0.



        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");



        int numIntentado;
        do {
            System.out.println ("Introduzca un número:");
            numIntentado = teclado.nextInt();

            if (numIntentado > numSecreto) System.out.println ("El número es más pequeño.\n");
            if (numIntentado < numSecreto) System.out.println ("El número es mas grande.\n");
        } while (numIntentado != numSecreto);

        System.out.println ("Muy bien, ¡has acertado! El número secreto era: " + numSecreto);
    }
}
