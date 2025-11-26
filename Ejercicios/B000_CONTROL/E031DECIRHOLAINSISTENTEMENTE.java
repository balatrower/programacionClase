package B000_CONTROL;

public class E031DECIRHOLAINSISTENTEMENTE {
    static void main(String[] args) {
        int numeroVeces = Integer.parseInt(IO.readln("Escribe un numero: "));
        Utilidades.decirHola(numeroVeces);
    }

    public static class Utilidades {
        public static void decirHola(int numeroVeces) {
            for (int i = 1; i <= numeroVeces; i++) {
                System.out.println("¡Hola!");
            }
        }
    }
}
