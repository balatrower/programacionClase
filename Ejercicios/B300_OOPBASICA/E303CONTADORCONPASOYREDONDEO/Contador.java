package B300_OOPBASICA.E303CONTADORCONPASOYREDONDEO;

public class Contador {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int VALOR_POR_DEFECTO = 50;

    private int valor;
    private String etiqueta;
    private int paso;
    private boolean redondeo;

    public Contador() {
        setRedondeo(false);
        setPaso(1);
        resetear();
        setEtiqueta("unidades");
    }

    public Contador(int valor) {
        setRedondeo(false);
        setPaso(1);
        setValor(valor);
        setEtiqueta("unidades");
    }

    public Contador(int valor, int paso) {
        setRedondeo(false);
        setPaso(paso);
        setValor(valor);
        setEtiqueta("unidades");
    }

    public Contador(int valor, int paso, boolean redondeo) {
        setRedondeo(redondeo);
        setPaso(paso);
        setValor(valor);
        setEtiqueta("unidades");
    }

    public Contador(int valor, String etiqueta) {
        setRedondeo(false);
        setPaso(1);
        setValor(valor);
        setEtiqueta(etiqueta);
    }

    public Contador(int valor, String etiqueta, int paso, boolean redondeo) {
        setRedondeo(redondeo);
        setPaso(paso);
        setValor(valor);
        setEtiqueta(etiqueta);
    }

    public String toString() {
        return getValor() + " llaves";
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if      (valor <= MIN) this.valor = MIN;
        else if (valor >= MAX) this.valor = MAX;
        else if (redondeo) this.valor = (valor / this.paso) * this.paso;
        else                   this.valor = valor;

        // Alternativa más corta pero más críptica (no mola):
        // valor = Math.min(Math.max(nuevoValor, 0), 100);
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setPaso(int paso) {
        if (paso <= 1) {
            this.redondeo = false; //no tiene sentido redondear a 1 o 0, deactivar redondeo, mejor desactivar redondeo que hacer algo que el usuario no quiere.
            this.paso = 1; // previene para cuando paso originalmente era 0 o negativo
        } else this.paso = paso;
    }

    public int getPaso() {
        return paso;
    }

    public void setRedondeo(boolean redondeo) {
        this.redondeo = redondeo;
    }

    public boolean isRedondeo() {
        return this.redondeo;
    }

    public void resetear() {
        setValor(VALOR_POR_DEFECTO);
    }

    public void incrementar() {
        if (this.paso == 1) {
            incrementar(1);
        } else {
            incrementar(paso);
        }
    }

    public void incrementar(int diferencia) {
        setValor(getValor() + diferencia);
    }

    public void decrementar() {
        if (this.paso == 1) {
            decrementar(1);
        } else {
            decrementar(paso);
        }
    }

    public void decrementar(int diferencia) {
        setValor(valor - diferencia);
    }
}
