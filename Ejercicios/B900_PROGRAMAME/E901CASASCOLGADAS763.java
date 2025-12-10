package B900_PROGRAMAME;

import java.util.Scanner;

public class E901CASASCOLGADAS763 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadPalabras = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cantidadPalabras; i++) {
            String palabraActual = entrada.nextLine();
            String respuesta = (palabraActual.toLowerCase().equals("colgadas")) ? "Bien" : "Mal";
            System.out.println(respuesta);
        }
    }
}
