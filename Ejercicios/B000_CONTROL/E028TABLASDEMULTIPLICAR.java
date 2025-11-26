package B000_CONTROL;

import module java.base;

public class E028TABLASDEMULTIPLICAR {
    void main() {
        Random rand = new Random();

        String stringTablasMultiplicar = IO.readln("Di el numero de tablas de multiplicar a imprimir: ");

        int numeroTablasMultiplicar = 0;
        if (stringTablasMultiplicar.equalsIgnoreCase("alan")) {
            numeroTablasMultiplicar = rand.nextInt(100) + 1;
        } else {
            numeroTablasMultiplicar = Integer.parseInt(stringTablasMultiplicar);
        }

        while (numeroTablasMultiplicar <= 0) {
            numeroTablasMultiplicar = Integer.parseInt(IO.readln("El numero no puede ser 0 o negativo, introduce un numero de nuevo: "));
        }


        for (int i = 1; i <= numeroTablasMultiplicar; i++) {
            IO.println("Tabla del " + i);
            int helper = i;
            for (int j = 1; j <= 10; j++) {
                int resultado = helper * j;
                System.out.format("%d x %d = %d \n", i, j, resultado);
            }
            IO.println();
        }
    }
}