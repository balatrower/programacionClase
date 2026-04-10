package B800_VARIOS.E862MASEXCEPCIONESRELOJ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Reloj reloj = null;

        do {
            try {
                int totalMinutos = Integer.parseInt(IO.readln("Escribe una cantidad de minutos para darle a un reloj: "));
                reloj = new Reloj(totalMinutos);
            } catch (DesbordamientoRelojException e) {
                System.out.println("Demasiados minutos, desbordamiento del reloj por: " + e.getExcesoMinutos());
            } catch (HoraNoValidaException e) {
                IO.println("Hora introducida no valida");
            } catch (MinutoNoValidoException e) {
                IO.println("Cantidad de minutos introducidos no validos");
            } catch (NumberFormatException e) {
                IO.println("No puedes escribir caracteres de texto, solo numeros");
            } catch (Exception e) {
                IO.println("Error inesperado: ");
                e.printStackTrace();
            }
        } while (reloj ==  null);

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