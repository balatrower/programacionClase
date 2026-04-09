package B800_VARIOS.E861EXCEPCIONESENRELOJ;

public class OperacionNegativaRelojException extends Exception {
    private static final long serialVersionUID = 1L;

    public OperacionNegativaRelojException(String mensaje) {
        super(mensaje);
    }
}