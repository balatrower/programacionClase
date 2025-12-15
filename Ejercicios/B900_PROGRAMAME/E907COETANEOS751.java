package B900_PROGRAMAME;

import java.util.Scanner;

public class E907COETANEOS751 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int fechaNacimiento1 = entrada.nextInt();
            int fechaMuerte1 = entrada.nextInt();

            int fechaNacimiento2 = entrada.nextInt();
            int fechaMuerte2 = entrada.nextInt();

            int fechaNacimientoMasJoven = (fechaNacimiento1 > fechaNacimiento2) ? fechaNacimiento1 : fechaNacimiento2;
            int fechaMuerteMasJoven = (fechaMuerte1 > fechaMuerte2) ? fechaMuerte2 : fechaMuerte1;

            int numAnyosVivosAmbos = Math.abs(fechaNacimientoMasJoven - fechaMuerteMasJoven) + 1;

            if (fechaNacimientoMasJoven > fechaMuerteMasJoven) {
                numAnyosVivosAmbos = 0;
            }
            System.out.println(numAnyosVivosAmbos);
        }
    }
}
