package B900_PROGRAMAME;

import java.util.HashMap;
import java.util.Scanner;

public class E917TELEGRAMAMASCORTO637 {
    static public void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<Character, Integer> mapa = new HashMap<>();

        inicializarMapa(mapa);

        int casosPrueba = entrada.nextInt();
        entrada.nextLine();
        while (casosPrueba-- != 0) {
            String[] frase = entrada.nextLine().split(" ");

            int valorFrase = 0;
            for (int i = 0; i < frase.length; i++) {
                String palabra = frase[i];
                if (i > 0) valorFrase += 5;

                for (int j = 0; j < palabra.length(); j++) {
                    if (j > 0) valorFrase += 3;
                    valorFrase += mapa.get(palabra.charAt(j));
                }
            }

            System.out.println(valorFrase);
        }
    }

    static public void inicializarMapa(HashMap<Character, Integer> mapa) {
        mapa.put('A', calcularCosteSecuencia(".-"));
        mapa.put('B', calcularCosteSecuencia("-..."));
        mapa.put('C', calcularCosteSecuencia("-.-."));
        mapa.put('D', calcularCosteSecuencia("-.."));
        mapa.put('E', calcularCosteSecuencia("."));
        mapa.put('F', calcularCosteSecuencia("..-."));
        mapa.put('G', calcularCosteSecuencia("--."));
        mapa.put('H', calcularCosteSecuencia("...."));
        mapa.put('I', calcularCosteSecuencia(".."));
        mapa.put('J', calcularCosteSecuencia(".---"));
        mapa.put('K', calcularCosteSecuencia("-.-"));
        mapa.put('L', calcularCosteSecuencia(".-.."));
        mapa.put('M', calcularCosteSecuencia("--"));
        mapa.put('N', calcularCosteSecuencia("-."));
        mapa.put('O', calcularCosteSecuencia("---"));
        mapa.put('P', calcularCosteSecuencia(".--."));
        mapa.put('Q', calcularCosteSecuencia("--.-"));
        mapa.put('R', calcularCosteSecuencia(".-."));
        mapa.put('S', calcularCosteSecuencia("..."));
        mapa.put('T', calcularCosteSecuencia("-"));
        mapa.put('U', calcularCosteSecuencia("..-"));
        mapa.put('V', calcularCosteSecuencia("...-"));
        mapa.put('W', calcularCosteSecuencia(".--"));
        mapa.put('X', calcularCosteSecuencia("-..-"));
        mapa.put('Y', calcularCosteSecuencia("-.--"));
        mapa.put('Z', calcularCosteSecuencia("--.."));
        mapa.put('?', calcularCosteSecuencia("..--.."));
        mapa.put('!', calcularCosteSecuencia("-.-.--"));
    }

    static public int calcularCosteSecuencia(String secuencia) {
        int puntos = 0;
        int rayas = 0;
        for (int i = 0; i < secuencia.length(); i++) {
            if (secuencia.charAt(i) == '-') {
                rayas++;
            } else {
                puntos++;
            }
        }

        return puntos + (rayas * 3) + (secuencia.length() - 1);
    }
}
