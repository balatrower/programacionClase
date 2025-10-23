package ProgramacionClase;

public class E033TRIPLICAR {
    public static void main(String[] args) {
        int triple = E033TRIPLICAR.Utilidades.triplicar(Integer.parseInt(IO.readln("Introduce un numero: ")));
        System.out.println("Su triple es: " + triple);
    }

    public static class Utilidades {
        public static int triplicar(int x) {
            return 3 * x;
        }
    }
}
