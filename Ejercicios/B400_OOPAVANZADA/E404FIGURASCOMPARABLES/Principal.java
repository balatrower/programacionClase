package B400_OOPAVANZADA.E404FIGURASCOMPARABLES;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[] {7, 4, 2, 3, 1};
        Figura[] figuras = new Figura[5];
        figuras[0] = new Circulo(8.27);
        figuras[1] = new Rectangulo(7.1, 5.0);
        figuras[2] = new Cuadrado(10.0);
        figuras[3] = new Circulo(66.3);
        figuras[4] = new Rectangulo(7.83, 2.13);

        Arrays.sort(numeros);
        Arrays.sort(figuras);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println();
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
        }
    }
}