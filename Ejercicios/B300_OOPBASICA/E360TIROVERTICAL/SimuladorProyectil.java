package B300_OOPBASICA.E360TIROVERTICAL;

public class SimuladorProyectil {
    void main() {
        Proyectil projectile = new Proyectil(60);
        final double timeElapses = 0.0001;
        double time = 0;
        while (projectile.getPosY() >= 0) {
            IO.println("speed: " + projectile.getSpeed());
            IO.println("yPos: " + projectile.getPosY());
            IO.println("time stamp: " + time);
            IO.println();
            projectile.update(time);
            time = time + timeElapses;
        }
    }

    /*
    *   No, no dan el mismo resultado cuando van a tocar el suelo, eso es porque el deltaTime es mas preciso
    *   cuanto mas pequeño es debido a que puede dar mas pasos que seria como tener mas resolucion, con el 1
    *   se ejcuta solo como 4 iteraciones del bucle, pero si pones 0.001 se ejcuta muchisimas veces mas y
    *   mirando los valores puedes hasta ver (conimaginacion) la cruva en la posicion inicial hasta el 0.
    */
}
