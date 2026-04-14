package B800_VARIOS.E855PRIORITYQUEUETRIAGEDELHOSPITAL;

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private int nivelGravedad;

    public Paciente(String nombre, String sintoma, int nivelGravedad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.nivelGravedad = nivelGravedad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.nivelGravedad, otro.nivelGravedad);
    }

    @Override
    public String toString() {
        return nombre + " (Nivel " + nivelGravedad + " - " + sintoma + ")";
    }
}
