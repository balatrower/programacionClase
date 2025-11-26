package B000_CONTROL;

public class E021MAYORYMENORDENNUMEROS {
    void main() {
        int numeroIteraciones = Integer.parseInt(IO.readln("¿Cuantos numeros desea introducir?"));

        int numeroMayor = 0;
        int numeroMenor = Integer.MAX_VALUE;
        IO.println("Introduzca los numeros a continuacion: ");
        for (int i = 0; i < numeroIteraciones; i++) {
            int numero = Integer.parseInt(IO.readln());

            if (numero > numeroMayor) {
                numeroMayor = numero;
            }

            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }

        System.out.format("El menor era %d y el mayor era %d", numeroMenor, numeroMayor);
    }
}