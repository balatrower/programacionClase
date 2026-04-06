package B300_OOPBASICA.E365MOTORDIESEL;

public interface EstrategiaCurvaPar {
    double[] PUNTOS_PAR = {150.0, 350.0, 50.0};
    double[] PUNTOS_RPM = {800.0, 2500.0, 4500.0};

    double calcularPar(double rpm);
}
