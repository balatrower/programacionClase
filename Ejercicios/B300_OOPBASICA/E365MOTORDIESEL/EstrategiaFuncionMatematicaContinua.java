package B300_OOPBASICA.E365MOTORDIESEL;

public class EstrategiaFuncionMatematicaContinua implements EstrategiaCurvaPar {
    EstrategiaFuncionMatematicaContinua() {
    }

    @Override
    public double calcularPar(double rpm) {
        double APERTURA = -0.000086;
        double par = APERTURA * ((rpm - PUNTOS_RPM[1]) * (rpm - PUNTOS_RPM[1])) + PUNTOS_PAR[1];

        if (rpm < 800 || rpm > 4500) {
             return 0;
        } else {
            return par;
        }
    }
}
