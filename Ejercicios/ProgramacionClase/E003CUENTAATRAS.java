package ProgramacionClase;

public class E003CUENTAATRAS {
    void main() {
        int contador = 0;
        while (contador <= 0) {
            contador = Integer.parseInt(IO.readln("Introduce un numero: "));
            if (contador <= 0) {
                IO.println("Escribe un numero positivo o que no sea 0");
            }
        }

        for (int i = 1; i <= contador; contador--) {
            IO.println(contador);
        }

        IO.println("¡Despegue!");
    }
}