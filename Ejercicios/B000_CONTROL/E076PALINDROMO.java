package B000_CONTROL;

public class E076PALINDROMO {
    void main() {
        String textoDado = "";
        while (textoDado.length() <= 2) {
            textoDado = IO.readln("Introduce un texto de mas de dos caracteres para verificar si es palíndromo: ");
        }

        String respuesta = "NO";
        if (esPalindromo(textoDado)) {
            respuesta = "SI";
        }

        System.out.format("%s %s es un palindromo", textoDado, respuesta);
    }

    boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll(" ", "").toLowerCase();

        int inicio = 0;
        int fin = textoLimpio.length() - 1;

        while (inicio < fin) {
            if (textoLimpio.charAt(inicio) != textoLimpio.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}