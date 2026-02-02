package B300_OOPBASICA.E304CONTADORCONMINMAXCONFIGURABLES;

public class Contador {
    private static final int VALOR_POR_DEFECTO = 50;

    private int valor;
    private String etiqueta;
    private int paso;
    private boolean redondeo;
    private int valorMax = 100;
    private int valorMin = 0;

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

    public Contador(int valor, int paso, int valorMax) {
        setRedondeo(false);
        setPaso(paso);
        setValor(valor);
        setEtiqueta("unidades");
        setValorMax(valorMax);
    }

    public Contador(int valor, int paso, int valorMax, int valorMin) {
        setRedondeo(false);
        setPaso(paso);
        setValor(valor);
        setEtiqueta("unidades");
        setValorMax(valorMax);
        setValorMin(valorMin);
    }

    public Contador(int valor, int paso, boolean redondeo) {
        setRedondeo(redondeo);
        setPaso(paso);
        setValor(valor);
        setEtiqueta("unidades");
    }

    public Contador(int valor, int paso, boolean redondeo, int valorMax, int valorMin) {
        setRedondeo(redondeo);
        setPaso(paso);
        setValor(valor);
        setEtiqueta("unidades");
        setValorMax(valorMax);
        setValorMin(valorMin);
    }

    public Contador(int valor, String etiqueta) {
        setRedondeo(false);
        setPaso(1);
        setValor(valor);
        setEtiqueta(etiqueta);
    }

    public Contador(int valor, String etiqueta, int valorMax, int valorMin) {
        setRedondeo(false);
        setPaso(1);
        setValor(valor);
        setEtiqueta(etiqueta);
        setValorMax(valorMax);
        setValorMin(valorMin);
    }

    public Contador(int valor, String etiqueta, int paso, boolean redondeo) {
        setRedondeo(redondeo);
        setPaso(paso);
        setValor(valor);
        setEtiqueta(etiqueta);
    }

    public Contador(int valor, String etiqueta, int paso, boolean redondeo, int valorMax, int valorMin) {
        setRedondeo(redondeo);
        setPaso(paso);
        setValor(valor);
        setEtiqueta(etiqueta);
        setValorMax(valorMax);
        setValorMin(valorMin);
    }

    public String toString() {
        return getValor() + " llaves";
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if      (valor <= valorMin) this.valor = valorMin;
        else if (valor >= valorMax) this.valor = valorMax;
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

    public void setValorMax(int valorMax) {
        if (this.valor > valorMax) {
            this.valor = valorMax;
        }
        this.valorMax = valorMax;
    }

    public int getValorMax() {
        return valorMax;
    }

    public void setValorMin(int valorMin) {
        if (this.valor < valorMin) {
            this.valor = valorMin;
        }
        this.valorMin = valorMin;
    }

    public int getValorMin() {
        return valorMin;
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
