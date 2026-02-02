package B300_OOPBASICA.E312CUENTABANCARIACONINT;

public class Cuenta {
    private long saldo = 0;
    private boolean admiteDescubierto = false;
    private long descubiertoMaximo = 10000;
    private long descubiertoActual;

    Cuenta() {
    }

    Cuenta(double saldo) {
        this.saldo = convertirDouble(saldo);
    }

    Cuenta(double saldo, boolean admiteDescubierto) {
        this.saldo = convertirDouble(saldo);
        this.admiteDescubierto = admiteDescubierto;
    }

    Cuenta(double saldo, boolean admiteDescubierto, double descubiertoMaximo) {
        this.saldo = convertirDouble(saldo);
        this.admiteDescubierto = admiteDescubierto;
        this.descubiertoMaximo = convertirDouble(descubiertoMaximo);
    }

    @Override
    public String toString() {
        String descubierto = (admiteDescubierto) ? "SI" : "NO";
        if (saldo <= 0 && descubiertoActual > 0) {
            return String.format("La cuenta tiene -%.2f de saldo y %s admite descubiertos con un maximo de %.2f", (formatearADecimal(this.saldo + this.descubiertoActual)), descubierto, formatearADecimal(this.descubiertoMaximo));
        } else if (descubierto.equals("SI")) {
            return String.format("La cuenta tiene %.2f de saldo y %s admite descubiertos con un maximo de %.2f", formatearADecimal(this.saldo), descubierto, formatearADecimal(this.descubiertoMaximo));
        } else {
            return String.format("La cuenta tiene %.2f de saldo y %s admite descubiertos", (formatearADecimal(this.saldo + this.descubiertoActual)), descubierto);
        }
    }

    @Override
    public Cuenta clone(){
        Cuenta clon = new Cuenta();
        clon.setSaldo(this.saldo / 100.00); //necesario debido setSaldo contiene un convertirDouble extra
        clon.setAdmiteDescubierto(this.admiteDescubierto);
        clon.setDescubiertoMaximo(this.descubiertoMaximo / 100.00); //misma razon que saldo
        return clon;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cuenta)) return false;

        if (obj == this) return true;

        return ((Cuenta) obj).getSaldo() == this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = convertirDouble(saldo);
    }

    public long getSaldo() {
        return saldo;
    }

    public void setAdmiteDescubierto(boolean admiteDescubierto) {
        this.admiteDescubierto = admiteDescubierto;
    }

    public boolean isAdmiteDescubierto() {
        return admiteDescubierto;
    }

    public void setDescubiertoMaximo(double descubiertoMaximo) {
        this.descubiertoMaximo = convertirDouble(descubiertoMaximo);
    }

    public long getDescubiertoMaximo() {
        return descubiertoMaximo;
    }

    public void setDescubiertoActual(long descubiertoActual) {
        this.descubiertoActual = convertirDouble(descubiertoActual);
    }

    public double getDescubiertoActual() {
        return descubiertoActual;
    }

    public void ingresarCajero(double sumatorio) {
       this.saldo = this.saldo + convertirDouble(sumatorio);
    }

    public void extraerCajero(double extraer) {
        if (this.saldo - extraer < 0) {
            throw new RuntimeException("Descubierto máximo superado / ó / Saldo insuficiente");
        }
        this.saldo = this.saldo - convertirDouble(extraer);
    }

    public void cargarRecibo(double importe) {
        this.saldo = this.saldo - convertirDouble(importe);
        ajustarDescubierto();
    }

    private void ajustarDescubierto() {
        if (this.saldo < 0 && this.admiteDescubierto) {
            this.descubiertoActual = this.descubiertoActual + Math.abs(this.saldo);
            this.saldo = 0;

            if (this.descubiertoActual > this.descubiertoMaximo) {
                throw new RuntimeException("Descubierto máximo superado / ó / Saldo insuficiente");
            }
        } else if (this.saldo < 0) {
            throw new RuntimeException("Descubierto máximo superado / ó / Saldo insuficiente");
        }
    }

    private double formatearADecimal(long saldo) {
        double saldoDouble = saldo;
        saldoDouble = saldoDouble / 10;
        saldoDouble = saldoDouble / 10;
        return saldoDouble;
    }

    private long convertirDouble(double valorEntrante) {
        double auxiliarCalculoCentimos = valorEntrante * 100;
        return (long) auxiliarCalculoCentimos; //aun poniendo aqui un * 100 primero hace el type cast y omitia el decimal
    }
}
