package ProgramacionClase;

public class E037MODULOSVARIOS {
    void main() {
        int cantidadNumerosAProcesar = 0;
        while (cantidadNumerosAProcesar <= 49) {
            try {
                cantidadNumerosAProcesar = Integer.parseInt(IO.readln("Introduce un numero que no sea 0 o negativo: "));
            } catch (Exception enrique) {
                IO.println("No se puede procesar texto, por favor escribe números.");
            }
        }

        for (int i = 0; i <= cantidadNumerosAProcesar; i++) {
            int modulo = i % 5;

            String respuesta = "NO";
            int multiplo = i % 7;

            if (multiplo == 0) {
                respuesta = "SI";
            }

            System.out.format("Vamos por el número %d. %d modulo de 5 es %d. El número %s es múltiplo de 7\n", i, i, modulo, respuesta);
        }
    }
}