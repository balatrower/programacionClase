package B900_PROGRAMAME;

import java.util.Scanner;

public class E921CASTILLOSDENAIPES741 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            long numPisos = entrada.nextLong();
            long totalCartas = (3 * (numPisos * numPisos) + numPisos) / 2;
            System.out.println(totalCartas);
        }
    }
}
