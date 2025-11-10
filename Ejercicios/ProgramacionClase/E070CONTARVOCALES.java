void main() {
    String texto = IO.readln("Introduce un texto para contar cuantas vocales tiene: ");

    System.out.format("El texto: %s tiene: %d vocales", texto, contarVocales(texto));
}

int contarVocales(String texto) {
    int contadorVocales = 0;
    String textoMinuscula = texto.toLowerCase();
    Character[] arrayVocalesTilde = {'á', 'é', 'í', 'ó', 'ú', 'ü'};
    Character[] arrayVocales = {'a', 'e', 'i', 'o', 'u'};

    for (int i = 0; i < texto.length(); i++) {
        boolean esVocalConTilde = false;
        boolean esVocal = false;
        char c = textoMinuscula.charAt(i);

        for (char caracterArray: arrayVocales) {
            if (caracterArray == c) {
                esVocal = true;
                break;
            }
        }

        for (char caracterArray: arrayVocalesTilde) {
            if (caracterArray == c) {
                esVocalConTilde = true;
                break;
            }
        }

        if (esVocal) {
            contadorVocales++;
        } else if (esVocalConTilde) {
            contadorVocales++;
        }
    }

    return contadorVocales;
}