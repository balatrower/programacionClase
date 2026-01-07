package B200_ALGORITMICA;

import java.util.Scanner;

public class E213RADAR {
    void main() {
        String textoEntrada = """
                4
                30
                10 200
                15 350
                17 420
                19 540
                5
                25
                10 100
                14 160
                19 300
                24 390
                26 700
                0
                """;

        Scanner entrada = new Scanner(textoEntrada);
        boolean salir = false;
        do {
            int casosPrueba = entrada.nextInt();

            if (casosPrueba <= 0) {
                salir = true;
                continue;
            }

            int velocidadLimite = entrada.nextInt();
            procesarCasos(casosPrueba, velocidadLimite, entrada);
            IO.println("");

        } while (!salir);
    }

    public void procesarCasos(int casosPrueba, int velocidadLimite, Scanner entrada) {
        int[] tiempos = new int[casosPrueba];
        int[] distancias = new int[casosPrueba];

        for (int i = 0; i < casosPrueba; i++) {
            tiempos[i] = entrada.nextInt();
            distancias[i] = entrada.nextInt();
        }

        int contadorInfracciones = 1;
        for (int i = 1; i < casosPrueba; i++) {
            int tiempoTranscurridoEntrePuntosControl = tiempos[i] - tiempos[i - 1];
            int distanciaRecorridaEntrePuntosControl = distancias[i] - distancias[i - 1];
            int velocidadCasoActual = distanciaRecorridaEntrePuntosControl / tiempoTranscurridoEntrePuntosControl;

            if (velocidadCasoActual > velocidadLimite && contadorInfracciones < 2) {
                contadorInfracciones++;
                IO.println("AVISO");
            } else if (velocidadCasoActual > velocidadLimite) {
                contadorInfracciones++;
                IO.println("MULTA");
            } else {
                IO.println("TODO BIEN");
            }
        }
    }
}