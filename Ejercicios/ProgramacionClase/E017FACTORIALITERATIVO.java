package ProgramacionClase;

public class E017FACTORIALITERATIVO {
    void main() {
        int numeroLimite = Integer.parseInt(IO.readln("¿Factorial hasta que numero? "));

        int resultado = 1;
        //el usado para la operacion
        int numeroIncremental = 1;
        //el usado para imprimir el resultado (el de la izqueirda)
        int numeroActual = 0;
        String stringOperacion = numeroActual + "! = " + 1;
        //factorial del 0
        IO.println(stringOperacion);
        while (numeroLimite > 0) {
            resultado = resultado * numeroIncremental;
            numeroIncremental++;
            numeroActual++;
            numeroLimite--;

            //esto esta aqui pa actualizar el numero de la izquierda porque si no se queda como 0
            stringOperacion = numeroActual + "! = " + 1;
            for (int i = 2; i <= numeroActual; i++) {
                stringOperacion = stringOperacion + " x " + i;
            }
            IO.println(stringOperacion + " = " + resultado);
        }
    }
}