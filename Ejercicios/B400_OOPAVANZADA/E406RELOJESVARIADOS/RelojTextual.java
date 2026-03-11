package B400_OOPAVANZADA.E406RELOJESVARIADOS;

public abstract class RelojTextual extends Reloj {
    public RelojTextual() {
        super();
    }

    public RelojTextual(int h, int m) {
        super(h, m);
    }

    public abstract String toString();
}
