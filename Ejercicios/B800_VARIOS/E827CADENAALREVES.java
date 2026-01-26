package B800_VARIOS;

public class E827CADENAALREVES {
    void main() {
        String palabra;
        do {
            palabra = IO.readln("Escribe una palabra para escribirla invertida: ");
        } while (palabra.isEmpty());
        IO.println("La palabra " + palabra + " invertida es: ");
        imprimirPalabraInvertida(palabra);
    }

    void imprimirPalabraInvertida(String p) {
        if (p.length() == 1) {
            IO.print(p.charAt(0)); // caso caracter final
        } else {
            char caracterActual = p.charAt(0);
            String palabraSinPrimerChar = p.substring(1);
            imprimirPalabraInvertida(palabraSinPrimerChar);
            IO.print(caracterActual); //imprime en orden al estar depues de la llamada
        }
    }
}
