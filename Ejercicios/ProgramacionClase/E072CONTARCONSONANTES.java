package ProgramacionClase;

public class E072CONTARCONSONANTES {
    void main() {
        String texto = IO.readln("Escribe un texto para contar sus consonantes: ");
        IO.println("El texto escrito cuenta con " + contarConsonantes(texto) + " consonantes");
    }

    int contarConsonantes(String texto) {
        int contadorConsonantes = 0;
        String textoMinusculas = texto.toLowerCase();
        Character[] arrayVocales = {'e', 'i', 'o', 'u'};

        for (int i = 0; i <= texto.length() - 1; i++) {
            char c = textoMinusculas.charAt(i);

            if (c <= 'z' && c > 'a' || c == 'ñ') {
                int contadorVocales = 0;
                for (char caracterVocal : arrayVocales) {
                    if (c != caracterVocal) {
                        contadorVocales++;
                    }
                }

                if (contadorVocales == 4) {
                    contadorConsonantes++;
                }
            }
        }

        return contadorConsonantes;
    }
}