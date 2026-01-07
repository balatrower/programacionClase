package B200_ALGORITMICA;

public class E224ANALIZADORDETEXTO {
    void main() {
        String frase = IO.readln("Introduce una frase usando solo caracteres de letras y espacios, no puntos no comas. \n");

        int numeroPalabras = contarPalabras(frase);
        int numeroPalabrasLargas = contarPalabrasLargas(frase);
        String palabraMasLarga = buscarPalabraMasLarga(frase);

        IO.println("El texto tiene " + numeroPalabras + " palabras.");
        IO.println("De ellas " + numeroPalabrasLargas + " son largas (5 caracteres o mas)");
        IO.println("La palabra mas larga es " + palabraMasLarga + " y tiene " + palabraMasLarga.length() + " caracteres.");
    }

    public String buscarPalabraMasLarga(String frase) {
        String masLarga = "";
        StringBuilder palabra = new StringBuilder();

        for (int i = 0; i <= frase.length(); i++) {
            if (i < frase.length() && frase.charAt(i) != ' ') {
                palabra.append(frase.charAt(i));
            } else {
                if (palabra.length() > masLarga.length()) {
                    masLarga = palabra.toString();
                }
                palabra.setLength(0);
            }
        }
        return masLarga;
    }

    public int contarPalabrasLargas(String frase) {
        int contadorLargas = 0;
        StringBuilder palabra = new StringBuilder();

        for (int i = 0; i <= frase.length(); i++) {
            if (i < frase.length() && frase.charAt(i) != ' ') {
                palabra.append(frase.charAt(i));
            } else {
                if (palabra.length() >= 5) {
                    contadorLargas++;
                }
                palabra.setLength(0);
            }
        }
        return contadorLargas;
    }

    public int contarPalabras(String frase) {
        if (frase.isEmpty()) {
            return 0;
        }

        int contador = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
}