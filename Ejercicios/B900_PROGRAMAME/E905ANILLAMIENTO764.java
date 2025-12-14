package B900_PROGRAMAME;

import java.util.Scanner;

public class E905ANILLAMIENTO764 {
    public static void  main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int numCampanyas = entrada.nextInt();

            if (numCampanyas == 0) {
                break;
            }

            int numAvesAnilladasNuevas = 0;
            for (int i = 0; i < numCampanyas; i++) {
                int numAvesCapturadas = entrada.nextInt();
                int numAvesAnilladas = entrada.nextInt();

                numAvesAnilladasNuevas = numAvesAnilladasNuevas + (numAvesCapturadas - numAvesAnilladas);
            }
            System.out.println(numAvesAnilladasNuevas);
        }
    }
}