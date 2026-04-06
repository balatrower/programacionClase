package B300_OOPBASICA.E365MOTORDIESEL;

public class EstrategiaInterpolacionLineal implements EstrategiaCurvaPar {
    EstrategiaInterpolacionLineal() {
    }

    @Override
    public double calcularPar(double rpm) {
        if (rpm == PUNTOS_RPM[0]) return PUNTOS_PAR[0];
        else if (rpm > PUNTOS_RPM[0] && rpm < PUNTOS_RPM[1]) return devolverInterpolacionLinear(rpm, 0, 1);
        else if (rpm == PUNTOS_RPM[1]) return PUNTOS_PAR[1];
        else if (rpm < PUNTOS_RPM[2]) return devolverInterpolacionLinear(rpm, 1, 2);
        else if (rpm == PUNTOS_RPM[2]) return PUNTOS_PAR[2];
        else return 0;
    }

    private double devolverInterpolacionLinear(double rpm, int indicePunto1, int indicePunto2) {
        return PUNTOS_PAR[indicePunto1] + ((rpm - PUNTOS_RPM[indicePunto1]) * (PUNTOS_PAR[indicePunto2] - PUNTOS_PAR[indicePunto1])) / (PUNTOS_RPM[indicePunto2] - PUNTOS_RPM[indicePunto1]);
    }
}
