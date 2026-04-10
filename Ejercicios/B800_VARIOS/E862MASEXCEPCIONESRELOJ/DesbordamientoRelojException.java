package B800_VARIOS.E862MASEXCEPCIONESRELOJ;

public class DesbordamientoRelojException extends Exception {
    private boolean superior;

    public DesbordamientoRelojException(boolean superior) {
        this.superior = superior;
    }

    public boolean isSuperior() {
        return superior;
    }
}