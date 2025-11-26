package B000_CONTROL;

public class E074FRASEINVERTIDA {
    void main() {
        String frase = "";
        while (frase.isEmpty() || frase.length() == 1) {
            frase = IO.readln("Introduzca una frase o palabra de mas de un caracter: ");
        }

        String fraseInvertida = "";
        for (int pos = frase.length() - 1; pos >= 0; pos--) {
            char caracter = frase.charAt(pos);
            fraseInvertida += caracter;
        }

        IO.println("Frase invertida: " + fraseInvertida);
    }
}