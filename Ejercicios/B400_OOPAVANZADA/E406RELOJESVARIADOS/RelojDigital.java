package B400_OOPAVANZADA.E406RELOJESVARIADOS;

public class RelojDigital extends Reloj{
    @Override
    public String toString() {
        return String.format("%02d:%02d", h, m);
    }
}
