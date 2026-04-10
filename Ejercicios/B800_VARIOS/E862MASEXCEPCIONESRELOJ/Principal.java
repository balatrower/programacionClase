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
            } catch (Exception e) {
                IO.println("Formato no valido, tienen que ser numeros solo");
            }
        } while (reloj ==  null);

        IO.println("Horas del reloj creado: " + reloj.getH());
        IO.println("Minuto del reloj creado: " + reloj.getM());
    }
}