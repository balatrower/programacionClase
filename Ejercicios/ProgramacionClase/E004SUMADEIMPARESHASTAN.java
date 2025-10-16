package ProgramacionClase;

public class E004SUMADEIMPARESHASTAN {
    void main() {
        int contador = 0;

        while (contador <= 0) {
            contador = Integer.parseInt(IO.readln("Introduce un numero: "));

            if (contador <= 0) {
                IO.println("Introduce un numero positivo que no sea 0");
            }
        }

        int sumaTotalNumeros = 0;
        for (int i = 0; i < contador; i++) {
            if (i % 2 == 1) {
                sumaTotalNumeros = sumaTotalNumeros + i;
            }
        }

        IO.println("La suma total de los impares hasta " + contador + " es " + sumaTotalNumeros);
    }
}