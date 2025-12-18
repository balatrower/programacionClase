package B900_PROGRAMAME;

import java.util.Scanner;

public class E930DIBUJARTABLEROSAJEDREZ162 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanyoCuadrados = 0;

        do {
            tamanyoCuadrados = entrada.nextInt();

            if (tamanyoCuadrados == 0) {
                break;
            }

            char caracterNegroCuadrado = entrada.nextLine().replaceAll(" ", "").charAt(0);
            imprimirTablero(tamanyoCuadrados, caracterNegroCuadrado);
        } while (true);
    }

    public static void imprimirTablero(int tamanyo, char caracterNegras) {
        //JAVA 8 yep, no puedo usar .repeat() maldita sea
        System.out.print("|");
        for (int k = 0; k < 8 * tamanyo; k++) {
            System.out.print("-");
        }
        System.out.println("|");

        for (int i = 0; i < 8 * tamanyo; i++) {
            System.out.print("|");
            int filaCasilla = i / tamanyo;
            for (int j = 0; j < 8; j++) {
                if ((filaCasilla + j) % 2 != 0) {
                    imprimirCasilla(tamanyo, caracterNegras);
                } else {
                    imprimirCasilla(tamanyo);
                }
            }
            System.out.println("|");
        }

        System.out.print("|");
        for (int k = 0; k < 8 * tamanyo; k++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    public static void imprimirCasilla(int tamanyo) {
        for (int i = 0; i < tamanyo; i++ ) {
            System.out.print(" ");
        }
    }

    public static void imprimirCasilla(int tamanyo, char caracterDado) {
        for (int i = 0; i < tamanyo; i++ ) {
            System.out.print(caracterDado);
        }
    }
}