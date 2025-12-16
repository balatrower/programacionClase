package B900_PROGRAMAME;

import java.util.Scanner;

public class E912ESCUDOSROMANOS119 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            int numLegionarios = entrada.nextInt();

            if (numLegionarios == 0) {
                break;
            }

            int totalEscudosUsados = 0;
            int numLegionariosCuadradoActual = numLegionarios;
            int numLegionariosRestantes = numLegionarios;
            while (true) {
                if (numLegionariosRestantes <= 0) {
                    break;
                }
                //la parte entera de la raiz cuadrada de un numero nos da el tamaño maximo de su lado
                int ladoCuadrado = (int) Math.sqrt(numLegionariosRestantes);

                numLegionariosCuadradoActual = ladoCuadrado * ladoCuadrado;
                numLegionariosRestantes = numLegionariosRestantes - numLegionariosCuadradoActual;

                int numEscudosCuadradoActual = numLegionariosCuadradoActual + 4 * ladoCuadrado;
                totalEscudosUsados = totalEscudosUsados + numEscudosCuadradoActual;
            }
            System.out.println(totalEscudosUsados);
        }
    }
}
