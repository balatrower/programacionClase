package B400_OOPAVANZADA.E431GLOBOSDEDISTINTOSTIPOS;

public class GloboFlexible extends Globo {
    public GloboFlexible() {
        super();
    }

    public void inflar(int cantidad) {
        if (super.getAire() + cantidad > super.getCapacidad()) {
            if (cantidad < super.getCapacidad() * 0.05) {
                super.inflar(cantidad);
            } else {
                super.inflar(super.getCapacidad() + (int) (super.getCapacidad() * 0.11)); // inflar un 111% para que explote por no cumplir el delta de 5%
            }
        } else {
            super.inflar(cantidad);
        }
    }

    public boolean explotado() {
        if (super.getAire() > super.getCapacidad() + (super.getCapacidad() * 0.10)) {
            return true;
        }
        return false;
    }
}
