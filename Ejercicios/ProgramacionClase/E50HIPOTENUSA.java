package ProgramacionClase;

public class E50HIPOTENUSA {
    void main() {
        IO.println("La hipotenusa de los catetos dados es de: " + calcularHipotenusa(pedirNumeroPositivoDecimalConControlDeErrores(), pedirNumeroPositivoDecimalConControlDeErrores()));
    }

    double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    double pedirNumeroPositivoDecimalConControlDeErrores() {
        double numeroPedido = 0;
        while (numeroPedido <= 0) {
            try {
                numeroPedido = Double.parseDouble(IO.readln("Introduce un numero decimal que no sea negativo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}