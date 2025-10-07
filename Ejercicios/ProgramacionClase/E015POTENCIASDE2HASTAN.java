package ProgramacionClase;

public class E015POTENCIASDE2HASTAN {
    public static void main(String[] args) {
        int numeroIteraciones = Integer.parseInt(IO.readln("Hasta que numero quieres clacular potncias: "));

        int baseElegida = Integer.parseInt(IO.readln("Elige en que base quieres calcular las potencias: "));

        for (int i = 0; i < numeroIteraciones + 1; i++) {
            long resultado = 1;
            int base = baseElegida;
            for (int i1 = 0; i1 < i; i1++) {
                resultado *= base;
            }
            IO.println(base + "^" + i + " = " + resultado);
        }
    }
}
