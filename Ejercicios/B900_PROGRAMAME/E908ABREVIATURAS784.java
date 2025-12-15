package B900_PROGRAMAME;

import java.util.Scanner;

public class E908ABREVIATURAS784 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numCasos = entrada.nextInt();
        entrada.nextLine(); //limpiar el \n de la entrada anterior

        for (int i = 0; i < numCasos; i++) {
            String abreviaturaActual = entrada.nextLine();

            String abreviaturaActualFormateada = abreviaturaActual.replaceAll("\\.", "").replaceAll(" ", "");

            char[] arrayAbreviaturaCaracteres = abreviaturaActualFormateada.toCharArray();

            for (int j = 0; j < arrayAbreviaturaCaracteres.length; j++) {
                if (j == arrayAbreviaturaCaracteres.length - 1) { //ultimo char
                    System.out.print(String.valueOf(arrayAbreviaturaCaracteres[j]) + String.valueOf(arrayAbreviaturaCaracteres[j]) + ".\n");
                } else {
                    System.out.print(String.valueOf(arrayAbreviaturaCaracteres[j]) + String.valueOf(arrayAbreviaturaCaracteres[j]) + ". ");
                }
            }
        }
    }
}