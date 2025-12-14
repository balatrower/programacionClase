package B900_PROGRAMAME;

import java.util.Scanner;

public class E912CHECKMULT750 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true) {
            String numero = entrada.nextLine();

            if (numero.charAt(0) == '0' && numero.length() == 1) {
                break;
            }

            int multDigitos = 1;
            int contadorCeros = 0;
            for (char numeroActual: numero.toCharArray()) {
                if (numeroActual == '0') {
                    contadorCeros++;
                    continue;
                }

                multDigitos = multDigitos * Integer.parseInt(Character.toString(numeroActual));
            }

            String multDigitosString = Integer.toString(multDigitos);
            for (char digitoActual: multDigitosString.toCharArray()) {
                if (digitoActual == '0') {
                    contadorCeros++;
                }
            }

            String resultado = multDigitosString.replaceAll("0", "");
            System.out.println(resultado + Integer.toString(contadorCeros));
        }
    }
}