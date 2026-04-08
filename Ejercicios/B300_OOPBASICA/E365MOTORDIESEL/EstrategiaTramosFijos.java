package B300_OOPBASICA.E365MOTORDIESEL;

public class EstrategiaTramosFijos implements EstrategiaCurvaPar {
    EstrategiaTramosFijos() {
    }

    @Override
    public double calcularPar(double rpm) {
        if (rpm >= PUNTOS_RPM[0] && rpm < PUNTOS_RPM[1]) return PUNTOS_PAR[0];
        else if (rpm <= PUNTOS_RPM[2]) return PUNTOS_PAR[1];
        else return 0;
    }
}
