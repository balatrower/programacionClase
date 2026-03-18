package B400_OOPAVANZADA.E430GLOBOSCONJUGADORESMIXTOS;

public class Utils {
    public static int pedirNumeroEnteroNoNegativo() {
        int numero = 0;
        do {
            try {
                numero = Integer.parseInt(IO.readln("INTRODUCE UNA CANTIDAD DE AIRE PARA INFLAR EL GLOBO: "));
            } catch (NumberFormatException e) {
                IO.println("ESE NÚMERO NO ES VÁLIDO");
            }
        } while (numero <= 0);
        return numero;
    }

    // min incluido, max no, si incluye max - 1
    public static int generarNumeroAleatorio(int min, int max) {
        double numeroAleatorio = Math.random() * (max - min) + min;
        return (int) numeroAleatorio;
    }
}
