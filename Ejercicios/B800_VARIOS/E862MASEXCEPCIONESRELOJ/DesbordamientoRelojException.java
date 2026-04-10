package B800_VARIOS.E862MASEXCEPCIONESRELOJ;

public class DesbordamientoRelojException extends Exception {
    private boolean superior;
    private int excesoMinutos;

    public DesbordamientoRelojException(boolean superior, int excesoMinutos) {
        setExcesoMinutos(excesoMinutos);
        this.superior = superior;
    }

    public boolean isSuperior() {
        return superior;
    }

    public int getExcesoMinutos() {
        return excesoMinutos;
    }

    public void setExcesoMinutos(int excesoMinutos) {
        this.excesoMinutos = excesoMinutos;
    }
}