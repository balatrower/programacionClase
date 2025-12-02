package B100_ARRAYS;

public class E120APROBADOYCALIFICACIONMEDIAPONDERADA {
    void main() {
        double[] calificaciones = {5.7, 9.5, 4.9, 0.0, 7.75};
        double[] pesos = {0.15, 0.20, 0.25, 0.30, 0.10};

        boolean aprobadoTodasCalificaciones = true;
        double calificacionPonderada = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            calificacionPonderada += calificaciones[i] * pesos[i];

            if (calificaciones[i] < 4.0) {
                aprobadoTodasCalificaciones = false;
            }
        }

        boolean mediaSuficiente = calificacionPonderada >= 5.0;

        if (aprobadoTodasCalificaciones && mediaSuficiente) {
            IO.println("El alumno ha aprobado!!!!! | Nota del alumno: " + calificacionPonderada);
        } else {
            IO.println("El alumno ha suspendido... | Nota del alumno: " + calificacionPonderada);
        }
    }
}