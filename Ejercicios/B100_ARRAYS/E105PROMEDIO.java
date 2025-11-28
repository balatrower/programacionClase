package B100_ARRAYS;

public class E105PROMEDIO {
    void main() {
        double[] decimales = {1.5, 3.34, 5.67, 0.35, 7.23, 4.56};

        double media = 0;
        for (double decimalActual : decimales) {
            media = media + decimalActual;
        }

        media = media / decimales.length;
        IO.println("La media de los numeros del array es: " + media);
    }
}