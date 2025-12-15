package B900_PROGRAMAME;

import java.util.Scanner;

public class E906CUANTOSDIASFALTAN157 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadFechas = entrada.nextInt();

        for (int i = 0; i < cantidadFechas; i++) {
            int numDias = entrada.nextInt();
            int numMeses = entrada.nextInt();

            int numDiasTotales = 0;
            for (int j = 1; j < numMeses; j++) {
                switch (j) {
                    case 1:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    case 2:
                        numDiasTotales = numDiasTotales + 28;
                        break;

                    case 3:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    case 5:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    case 7:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    case 8:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    case 10:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    case 12:
                        numDiasTotales = numDiasTotales + 31;
                        break;

                    default:
                        numDiasTotales = numDiasTotales + 30;
                        break;
                }
            }

            numDiasTotales = numDiasTotales + numDias;
            System.out.println(365 - numDiasTotales);
        }
    }
}
