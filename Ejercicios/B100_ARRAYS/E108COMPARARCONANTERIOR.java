package B100_ARRAYS;

public class E108COMPARARCONANTERIOR {
    void main() {
        double[] notas = {2.4, 2.1, 1.7, 4.7, 5.7, 5.7, 7.6, 5.7};

        double mediaNotas = notas[notas.length - 1]; //el for tiene el length - 1 asi que el ultimo valor nunca llega a estar en el valor actual y necesita ser sumado.
        for (int indiceActual = 0; indiceActual < notas.length - 1; indiceActual++) {
            double valorActual = notas[indiceActual];
            double valorSiguente = notas[indiceActual + 1];

            String respuesta;
            if (valorSiguente == valorActual) {
                respuesta = "IGUAL";
            } else {
                respuesta = (valorSiguente > valorActual) ? "MAYOR" : "MENOR";
            }

            mediaNotas = mediaNotas + valorActual;
            System.out.format("El numero %d es %s que el numero %d.\n", indiceActual + 2, respuesta, indiceActual + 1); // +2 y +1 para que salga numero 1 minimo
        }

        mediaNotas = mediaNotas / notas.length;
        if (mediaNotas >= 5) {
            IO.println("APROBASTE EINSTEIN!! Nota media: " + mediaNotas);
        } else {
            IO.println("SUSPENDISTE MALDITO MICHAEL!! Nota media: " + mediaNotas);
        }
    }
}