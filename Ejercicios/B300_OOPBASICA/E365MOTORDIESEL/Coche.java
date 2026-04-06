package B300_OOPBASICA.E365MOTORDIESEL;

public class Coche {
    private MotorDiesel motor;
    private double velocidadActual = 0;
    private double masa = 500.0;
    private double relacionTransmision = 2300;

    Coche() {
        setMotor(new MotorDiesel(new EstrategiaFuncionMatematicaContinua()));
    }

    public void setMotor(MotorDiesel motor) {
        this.motor = motor;
    }

    public double getRelacionTransmision() {
        return relacionTransmision;
    }

    public double getMasa() {
        return masa;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void encenderMotor() {
        motor.encenderMotor();
    }

    public void apagarMotor() {
        motor.apagarMotor();
    }

    public void pisarAcelerador(double cantidad) {
        if (cantidad > 1) {
            motor.setPosAcelerador(1);
        } else if (cantidad < 0) {
            motor.setPosAcelerador(0);
        } else {
            motor.setPosAcelerador(cantidad);
        }
    }

    public void actualizarRPM(double dt) {
        double fuerzaEmpuje = motor.obtenerParNeto();
        double aceleracion = fuerzaEmpuje / getMasa();
        setVelocidadActual(getVelocidadActual() + (aceleracion * dt));
        double nuevasRPM = getVelocidadActual() * getRelacionTransmision();
        motor.setRpm(nuevasRPM);
    }

    public double obtenerRPM() {
        return motor.getRpm();
    }
}
