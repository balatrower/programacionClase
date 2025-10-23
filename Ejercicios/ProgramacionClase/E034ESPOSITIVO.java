package ProgramacionClase;

public class E034ESPOSITIVO {
    void main() {
        while (true) {
            String palabra = IO.readln("Introduce números para saber si son positivos o no (escribir mango sale del bucle) ");

            if (palabra.equalsIgnoreCase("mango")) {
                IO.println("Saliendo del programa");
                break;
            }

            int numero = Integer.parseInt(palabra);

            if (this.isPositivo(numero)) {
                System.out.format("El numero /%d es positivo!", numero);
            } else {
                System.out.format("El numero /%d es negativo!", numero);
            }

            IO.println();
        }
    }

    public static boolean isPositivo(int numero) {
        return numero >= 0;
    }
}