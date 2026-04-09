package B800_VARIOS.E861EXCEPCIONESENRELOJ;

public class DesbordamientoRelojException extends Exception {
    private static final long serialVersionUID = 1L;

    boolean superior;

    public boolean isSuperior() {
        return superior;
    }

    public void setSuperior(boolean superior) {
        this.superior = superior;
    }

    public DesbordamientoRelojException(String message, boolean superior) {
        super(message);
        this.superior = superior;
    }
}
