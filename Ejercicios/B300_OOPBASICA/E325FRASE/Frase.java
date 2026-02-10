package B300_OOPBASICA.E325FRASE;

public class Frase {
    private StringBuilder frase = new StringBuilder();

    public Frase() {
    }

    public Frase(String frase) {
        getFrase().append(frase);
    }

    public Frase(int repeticiones, String frase) {
        for (int i = 0; i < repeticiones - 1; i++) {
            getFrase().append(frase).append(" ");
        }
        getFrase().append(frase);
    }

    public StringBuilder getFrase() {
        return frase;
    }

    public void setFrase(StringBuilder frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return getFrase().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Frase)) return false;

        return ((Frase) obj).getFrase().toString().contentEquals(this.getFrase().toString());
    }

    @Override
    protected Frase clone() {
        Frase clon = new Frase();
        clon.setFrase(this.getFrase());
        return clon;
    }

    public char caracterEn(int posicion) {
        return getFrase().charAt(posicion);
    }

    public int longitud() {
        return getFrase().length();
    }

    public void anexar(String frase) {
        if (getFrase().isEmpty()) {
            getFrase().append(frase);
        } else {
            getFrase().append(" ");
            getFrase().append(frase);
        }
    }

    public void recortar(int numCaracteres) {
        getFrase().setLength(this.longitud() - numCaracteres);

        if (this.caracterEn(this.longitud() - 1) == ' ') {
            getFrase().setLength(this.longitud() - 1);
        }
    }
}
