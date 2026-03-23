package B400_OOPAVANZADA.E431GLOBOSDEDISTINTOSTIPOS;

public class GloboDefectuoso extends Globo{
    public GloboDefectuoso() {
        super();
    }

    public void inflar(int cantidad) {
        super.inflar(cantidad);
    }

    public boolean explotado() {
        double porcentajeCapacidadNominal = (double) super.getAire() / super.getCapacidad();
        if (porcentajeCapacidadNominal > 0.6 && porcentajeCapacidadNominal < 1.0) {
            double porcentajeCaminoRestante = (porcentajeCapacidadNominal - 0.6) / 0.4;
            if (Math.random() < porcentajeCaminoRestante) {
                return true;
            }
        } else if (porcentajeCapacidadNominal > 1.0) {
            return true;
        }
        return false;
    }
}
