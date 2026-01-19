package B900_PROGRAMAME;

import java.util.Scanner;

public class E920LLENANDOPISCINAS131 {
    public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);

        int piscinaA, barrenyoA, pierdeViajeA, piscinaB, barrenyoB, pierdeViajeB;
        int yo = 0;
        int vecino = 0;

        while (true) {

            piscinaA  = s.nextInt();
            barrenyoA = s.nextInt();
            pierdeViajeA   = s.nextInt();
            piscinaB  = s.nextInt();
            barrenyoB = s.nextInt();
            pierdeViajeB   = s.nextInt();

            if (piscinaA == 0 || piscinaB == 0) {
                break;
            }

            yo     = sacarNumeroViajes(piscinaA, barrenyoA, pierdeViajeA);
            vecino = sacarNumeroViajes(piscinaB, barrenyoB, pierdeViajeB);


            if (yo == vecino) System.out.println("EMPATE " + yo);
            else if (yo < vecino) System.out.println("YO " + yo);
            else System.out.println("VECINO " + vecino);
        }

    }

    private static int sacarNumeroViajes(int piscina, int barrenyo, int pierde) {
        if (pierde >= barrenyo && barrenyo < piscina) {
            return Integer.MAX_VALUE;
        } else if (barrenyo >= piscina) {
            return 1;
        }

        int viajes = 0;
        int aux = 0;
        int rest = 0;
        while (piscina > 1) {
            aux = piscina / barrenyo;
            rest = aux * pierde;
            piscina = (piscina - (aux * barrenyo)) + rest;
            viajes += aux;
            if (piscina != 0 && piscina <= barrenyo) {
                viajes++;
                break;
            }
        }
        return viajes;
    }
}
