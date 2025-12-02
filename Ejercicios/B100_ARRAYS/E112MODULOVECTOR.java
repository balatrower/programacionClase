package B100_ARRAYS;

public class E112MODULOVECTOR {
    void main() {
        double[] dobles = {4, 3, 6, 2};

        double sumaValores = 0;
        for (double valorActual : dobles) {
            sumaValores = sumaValores + valorActual * valorActual;
        }

        IO.println("El modulo del vector dado es de: " + Math.sqrt(sumaValores));
    }
}