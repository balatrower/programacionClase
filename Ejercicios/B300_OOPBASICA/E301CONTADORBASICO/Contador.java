package B300_OOPBASICA.E301CONTADORBASICO;

public class Contador {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final String ETIQUETA_DEFECTO = "Unidades";

    private int valor;
    private String etiqueta;

    public Contador(int valor, String etiqueta) {
        setValor(valor);
        setEtiqueta(etiqueta);
    }

    public Contador(int n) {
        setValor(n);
        setEtiqueta(ETIQUETA_DEFECTO);
    }

    public Contador() {
        setValor(MIN);
        setEtiqueta(ETIQUETA_DEFECTO);
    }

    public String toString() {
        return etiqueta + " " + valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int n) {
        valor = n < MIN ? MIN : n > MAX ? MAX : n;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void incrementar() {
        setValor(valor + 1);
    }

    public void decrementar() {
        setValor(valor - 1);
    }
}