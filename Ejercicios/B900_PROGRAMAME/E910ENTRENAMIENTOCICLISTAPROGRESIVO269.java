package B900_PROGRAMAME;

import java.util.Scanner;

public class E910ENTRENAMIENTOCICLISTAPROGRESIVO269 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int kilometrosTramoExtra = entrada.nextInt();
            int acumuladoTotalKilometros = kilometrosTramoExtra;
            int longitudRutaActual = kilometrosTramoExtra;

            while (kilometrosTramoExtra != 0) {
                kilometrosTramoExtra = entrada.nextInt();

                if (kilometrosTramoExtra != 0) {
                    longitudRutaActual = longitudRutaActual + kilometrosTramoExtra;
                    acumuladoTotalKilometros = acumuladoTotalKilometros + longitudRutaActual;
                }
            }

            System.out.println(acumuladoTotalKilometros * 2);
        }
    }
}