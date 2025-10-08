package ProgramacionClase;

public class E016POTENCIASDE2HASTAPARAR {
    void main() {
        int base = Integer.parseInt(IO.readln("Elige en que base quieres calcular las potencias: "));

        long resultado = 1;
        int contador = 0;
        char letra = 's';
        IO.println(base + "^" + contador + " = " + resultado);

        while (letra == 's') {
            letra = IO.readln("Dime una letra: \n" + "s = continuar bucle \n" + "n = salir bucle \n").toLowerCase().charAt(0);

            if (letra != 's' && letra != 'n') {
                IO.println("Letra no valida, intentelo de nuevo.");
                letra = 's';
                continue;
            }

            resultado *= base;
            contador++;

            if (base == 33) {
                String resultadoHex = Long.toHexString(resultado);
                IO.println(base + "^" + contador + " = " + resultadoHex);
                continue;
            }

            IO.println(base + "^" + contador + " = " + resultado);
        }
    }
}