package B300_OOPBASICA.E310CUENTABANCARIA;

public class Cuenta {
    private double saldo = 0;
    private boolean admiteDescubierto = false;
    private double descubiertoMaximo = 100;
    private double descubiertoActual;

    Cuenta() {
    }

    Cuenta(double saldo) {
        this.saldo = saldo;
    }

    Cuenta(double saldo, boolean admiteDescubierto) {
        this.saldo = saldo;
        this.admiteDescubierto = admiteDescubierto;
    }

    Cuenta(double saldo, boolean admiteDescubierto, double descubiertoMaximo) {
        this.saldo = saldo;
        this.admiteDescubierto = admiteDescubierto;
        this.descubiertoMaximo = descubiertoMaximo;
    }

    @Override
    public String toString() {
        String descubierto = (admiteDescubierto) ? "SI" : "NO";
        if (saldo <= 0 && descubiertoActual > 0) {
            return String.format("La cuenta tiene -%.2f de saldo y %s admite descubiertos con un maximo de %.2f", (this.saldo + this.descubiertoActual), descubierto, this.descubiertoMaximo);
        } else if (descubierto.equals("SI")) {
            return String.format("La cuenta tiene %.2f de saldo y %s admite descubiertos con un maximo de %.2f", this.saldo, descubierto, this.descubiertoMaximo);
        } else {
            return String.format("La cuenta tiene %.2f de saldo y %s admite descubiertos", (this.saldo + this.descubiertoActual), descubierto);
        }
    }

    @Override
    public Cuenta clone(){
        Cuenta clon = new Cuenta();
        clon.setSaldo(this.saldo);
        clon.setAdmiteDescubierto(this.admiteDescubierto);
        clon.setDescubiertoMaximo(this.descubiertoMaximo);
        return clon;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cuenta)) return false;

        if (obj == this) return true;

        return ((Cuenta) obj).getSaldo() == this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAdmiteDescubierto(boolean admiteDescubierto) {
        this.admiteDescubierto = admiteDescubierto;
    }

    public boolean isAdmiteDescubierto() {
        return admiteDescubierto;
    }

    public void setDescubiertoMaximo(double descubiertoMaximo) {
        this.descubiertoMaximo = descubiertoMaximo;
    }

    public double getDescubiertoMaximo() {
        return descubiertoMaximo;
    }

    public void setDescubiertoActual(double descubiertoActual) {
        this.descubiertoActual = descubiertoActual;
    }

    public double getDescubiertoActual() {
        return descubiertoActual;
    }

    public void ingresarCajero(double sumatorio) {
       this.saldo = this.saldo + sumatorio;
    }

    public void extraerCajero(double extraer) {
        if (this.saldo - extraer < 0) {
            throw new RuntimeException("Descubierto máximo superado / ó / Saldo insuficiente");
        }
        this.saldo = this.saldo - extraer;
    }

    public void cargarRecibo(double importe) {
        this.saldo = this.saldo - importe;
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
}
