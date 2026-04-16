package B900_PROGRAMAME;

import java.util.ArrayList;
import java.util.Scanner;

public class E935TECLADOESROPEADO144 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] secuenciaEnCaracteres = entrada.nextLine().toCharArray();

        ArrayList<Character> listaCaracteres = new ArrayList<>(secuenciaEnCaracteres.length);
        cargarListaConSecuencia(secuenciaEnCaracteres, listaCaracteres);


    }

    public static void cargarListaConSecuencia(char[] secuencia, ArrayList<Character> lista) {
        for (char caracter : secuencia) {
            lista.add(caracter);
        }
    }
}
