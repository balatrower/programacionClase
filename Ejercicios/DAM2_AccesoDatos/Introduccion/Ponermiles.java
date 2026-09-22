package DAM2_AccesoDatos.Introduccion;

public class Ponermiles {
    void main() {
        IO.print("Introduce un numero: ");
        String entrada = IO.readln();

        String salida = "";
        int offset = entrada.length() % 3; //desplazamiento para el correcto lugar de los puntos
        if (entrada.length() >= 4) {
            for (int i = 0; i < entrada.length(); i++) {
                if (i % 3 - offset == 0 && i != 0) { // aplicar el offset para que el punto este bien posicionado
                    salida = salida + ".";
                }
                salida = salida + entrada.charAt(i);
            }
        } else {
            salida = entrada;
        }
        IO.println("Resultado: " + salida);
    }
}