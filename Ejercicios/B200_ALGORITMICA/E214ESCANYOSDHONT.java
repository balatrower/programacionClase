package B200_ALGORITMICA;

public class E214ESCANYOSDHONT {
    void main() {
        int[] votos = {1463183, 1004599, 557780, 506164, 21742, 7652, 6749, 3784, 3407, 2902, 1751}; // Generales 2023 al Congreso, circunscripción de Madrid.
        int[] divisores = new int[votos.length];
        int[] escannos = new int[votos.length];
        int numEscannos = 37; // Los escaños que hay que repartir en esta circunscripción.
        int numeroPartidos = votos.length;

        divisores = inicializarDivisoresAUno(divisores);

        for (int i = 0; i < numEscannos; i++) {
            int partidoMayorVotos = -1;
            double cocienteMayor = -1;

            for (int j = 0; j < numeroPartidos; j++) {
                double cocientePartidoActual = (double) votos[j] / divisores[j];

                if (cocientePartidoActual > cocienteMayor) {
                    cocienteMayor = cocientePartidoActual;
                    partidoMayorVotos = j;
                }
            }

            escannos[partidoMayorVotos]++;
            divisores[partidoMayorVotos]++;
        }
        imprimirResultadosCalculoEscanyos(numEscannos, votos, numeroPartidos, escannos);
    }

    public void imprimirResultadosCalculoEscanyos(int numEscannos, int[] votos, int numeroPartidos, int[] escannos) {
        System.out.printf("Resultados de la asignacion de %d escaños con un total de %d votos: \n", numEscannos, averiguarCantidadVotosTotales(votos));
        IO.println("Partido   Votos   Escaños asignados");
        for (int i = 0; i < numeroPartidos; i++) {
            System.out.printf("   %d      %d      %d   \n", i, votos[i], escannos[i]);
        }
    }

    public int averiguarCantidadVotosTotales(int[] array) {
        int total = 0;
        for (int votosActuales : array) {
            total = total + votosActuales;
        }
        return total;
    }

    public int[] inicializarDivisoresAUno(int[] divisores) {
        for (int i = 0; i < divisores.length; i++) {
            divisores[i]++;
        }
        return divisores;
    }
}