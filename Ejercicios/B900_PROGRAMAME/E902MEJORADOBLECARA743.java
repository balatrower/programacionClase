package B900_PROGRAMAME;

import java.util.Scanner;

public class E902MEJORADOBLECARA743 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int numeroDocumentos = entrada.nextInt();

            if (numeroDocumentos == 0) {
                 break;
            }

            int contadorHojasSalvadas = 0;
            for (int i = 0; i < numeroDocumentos; i++) {
                int numeroHojas = entrada.nextInt();
                contadorHojasSalvadas += numeroHojas / 2;
            }
            System.out.println(contadorHojasSalvadas);
        }
        entrada.close();
    }
}