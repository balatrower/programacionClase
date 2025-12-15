package B900_PROGRAMAME;

import java.util.Scanner;

public class E903HIGOSROBADOS788 {
    public static void  main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casosPrueba = entrada.nextInt();

        for (int i = 0; i < casosPrueba; i ++) {
            int numeroLadrones = entrada.nextInt();
            int numeroHigos = entrada.nextInt();

            int repartoIgual = numeroHigos / numeroLadrones;
            int repartoDesigual = numeroHigos % numeroLadrones;

            int higosManola = repartoIgual + repartoDesigual;
            System.out.println(higosManola);
        }

        entrada.close();
    }
}