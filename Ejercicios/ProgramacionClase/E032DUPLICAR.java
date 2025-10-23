package ProgramacionClase;

public class E032DUPLICAR {
    public static void main(String[] args) {
        int doble = Utilidades.duplicar(7);
        System.out.println(doble);
    }

    public static class Utilidades {
        public static int duplicar(int x) {
            return 2 * x;
        }
    }
}