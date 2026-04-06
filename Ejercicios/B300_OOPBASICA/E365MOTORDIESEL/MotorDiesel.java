package B300_OOPBASICA.E365MOTORDIESEL;

public class MotorDiesel {
    private final double INERCIA_MOTOR = 0.2;
    private final double FRICCION_BASE = 20.0;

    private double rpm = 0;
    private double posAcelerador = 0.0;
    private boolean encendido = false;
    private EstrategiaCurvaPar estrategia;

    MotorDiesel(EstrategiaCurvaPar estrategia) {
        setEstrategia(estrategia);
    }

    public double getINERCIA_MOTOR() {
        return INERCIA_MOTOR;
    }

    public double getFRICCION_BASE() {
        return FRICCION_BASE;
    }

    public void setEstrategia(EstrategiaCurvaPar estrategia) {
        this.estrategia = estrategia;
    }

    public void setRpm(double rpm) {
        if (isEncendido() && rpm < 800) {
            this.rpm = 800;
        } else if (rpm > 4500) {
            this.rpm = 4500;
        } else {
            this.rpm = rpm;
        }
    }

    public double getRpm() {
        return rpm;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setPosAcelerador(double posAcelerador) {
        this.posAcelerador = posAcelerador;
    }

    public double getPosAcelerador() {
        return posAcelerador;
    }

    public void encenderMotor() {
        setRpm(800);
        setEncendido(true);
    }

    public void apagarMotor() {
        setRpm(0);
        setEncendido(false);
    }

    public double obtenerParActual() {
        return estrategia.calcularPar(getRpm());
    }

    public double obtenerParNeto() {
        double parActual = obtenerParActual();
        double parGenerado = parActual * getPosAcelerador();
        return parGenerado - getFRICCION_BASE();
    }
}
