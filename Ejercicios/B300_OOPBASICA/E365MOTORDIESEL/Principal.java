package B300_OOPBASICA.E365MOTORDIESEL;

public class Principal {
    void main() {
        Coche coche = new Coche();
        coche.encenderMotor();
        coche.pisarAcelerador(0.8);

        final double dt = 0.1;
        double tiempo = 0;
        while (tiempo < 15) {
            if (tiempo >= 10) {
                coche.pisarAcelerador(0.0);
            }

            coche.actualizarRPM(dt);

            System.out.printf("Tiempo: %.1f s, Velocidad: %.2f m/s, RPM: %.0f%n", tiempo, coche.getVelocidadActual(), coche.obtenerRPM());

            tiempo = tiempo + dt;
        }
    }
}
