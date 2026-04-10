package B800_VARIOS.E862MASEXCEPCIONESRELOJ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Reloj reloj = new Reloj(23, 57);
        boolean operacionOK = false;

        System.out.println("Valor inicial: " + reloj + "\n");

        do {
            try {
                System.out.print("Indica los minutos que quieres sumar: ");
                int minutos = teclado.nextInt();
                reloj.sumar(minutos);
                operacionOK = true;
            } catch (OperacionNegativaRelojException e) {
                System.out.println("Error: No puedes introducir minutos negativos.");
            } catch (DesbordamientoRelojException e) {
                if (e.isSuperior()) System.out.println("Te has salido del día por ARRIBA (más de 24h).");
                else System.out.println("Te has salido del día por ABAJO (menos de 00:00).");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número positivo válido. No me pongas letras ni cosas raras.");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                e.printStackTrace();
            }
        } while (!operacionOK);

        System.out.println("\nValor final: " + reloj);
    }
}