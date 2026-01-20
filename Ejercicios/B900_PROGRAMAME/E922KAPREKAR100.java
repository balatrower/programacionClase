package B900_PROGRAMAME;

import java.util.Arrays;
import java.util.Scanner;

public class E922KAPREKAR100 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char[] numero;
        int numCasos = s.nextInt();

        for (int i = 0; i < numCasos; i++) {

            numero = s.next().toCharArray();

            if (Integer.parseInt(new String(numero)) == 6174) {
                System.out.println( 0 );
                continue;
            }

            int numVueltas = 1;
            while (numVueltas < 8) {

                int descendente = ordenarDescendiente(numero);
                int ascendente  = ordenarAscendente(numero);
                int nuevoNumero = descendente - ascendente;

                if (nuevoNumero == 6174) {
                    break;
                }

                numero = String.valueOf(nuevoNumero).toCharArray();
                numVueltas++;
            }

            System.out.println( numVueltas );
        }

    }

    public static int ordenarAscendente(char[] numero) {
        Arrays.sort(numero);
        return Integer.parseInt(new String(numero));
    }

    public static int ordenarDescendiente(char[] numero) {
        Arrays.sort(numero);
        invertir(numero);
        int n = Integer.parseInt(new String(numero));
        return (n / 1000 == 0) ? multiplicarNumero(n) : n;
    }

    public static int multiplicarNumero(int numero) {
        if (numero != 0 && numero < 1000) return multiplicarNumero(numero * 10);
        return numero;
    }

    public static void invertir(char[] numero) {
        for (int i = 0; i < numero.length / 2; i++) {
            char temp = numero[numero.length - i - 1];
            numero[numero.length - i - 1] = numero[i];
            numero[i] = temp;
        }
    }
}
