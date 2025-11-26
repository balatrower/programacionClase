package B000_CONTROL;

public class E048MEDIA {
    void main() {
        int conadorNumeros = 0;
        int sumaNumeros = 0;
        int numeroDado = 1;
        while (numeroDado != 0) {
            try {
                numeroDado = Integer.parseInt(IO.readln("Escribe numeros positivos para sacar su media, un 0 termina el programa: "));
                ;

                if (numeroDado > 0) {
                    sumaNumeros += numeroDado;
                    conadorNumeros++;
                }
            } catch (Exception enrique) {
                IO.println("No se admite texto o numeros negativos.");
            }
        }

        int media = sumaNumeros / conadorNumeros;
        IO.println("La media de los numeros escritos es: " + media);
    }
}