package B000_CONTROL;

import java.util.Locale;

public class E090SWITCHYENUM {
    void main() {
        ejercicio1();

        ejercicio2();

        ejercicio3();

        ejercicio4();
    }

    private void ejercicio1() {
        IO.println("Introduce un numero del 1 al 7: ");
        int numero1 = pedirNumeroEntreCeroYDiezAUsuario();

        switch (numero1) {
            case 1:
                IO.println("Lunes");
                break;
            case 2:
                IO.println("Martes");
                break;
            case 3:
                IO.println("Miercoles");
                break;
            case 4:
                IO.println("Jueves");
                break;
            case 5:
                IO.println("Viernes");
                break;
            case 6:
                IO.println("Sabado");
                break;
            case 7:
                IO.println("Domingo");
                break;
            default:
                IO.println("Numero de dia no valido");
                break;
        }
    }

    private static void ejercicio2() {
        enum Mes {
            enero,
            febrero,
            marzo,
            abril,
            mayo,
            junio,
            julio,
            agosto,
            septiembre,
            octubre,
            noviembre,
            diciembre
        }

        Mes mes = Mes.valueOf(IO.readln("Escribe el nombre de un mes").toLowerCase());

        switch (mes) {
            case diciembre, enero, febrero:
                IO.println("El mes: " + mes + " es Invierno");
                break;
            case marzo, abril, mayo:
                IO.println("El mes: " + mes + " es Primeaver");
                break;
            case junio, julio, agosto:
                IO.println("El mes: " + mes + " es Verano");
                break;
            case septiembre, octubre, noviembre:
                IO.println("El mes: " + mes + " es Otoño");
                break;
        }
    }

    private void ejercicio3() {
        IO.println("Escribe un numero del 0 al 10: ");
        int numero2 = pedirNumeroEntreCeroYDiezAUsuario();

        String calificacion = switch (numero2) {
            case 9,10 -> "Sobresaliente";
            case 7,8 -> "Notable";
            case 5,6 -> "Aprobado";
            case 0,1,2,3,4 -> "Suspenso";
            default -> "Valor de nota no valido";
        };

        IO.println("Tu calificacion es: " + calificacion);
    }

    private static void ejercicio4() {
        enum Direccion {
            NORTE,
            SUR,
            ESTE,
            OESTE
        }

        Direccion direccion = Direccion.valueOf(IO.readln("Escribe una direccion cardinal completa: ").toUpperCase(Locale.ROOT));

        String accion = switch (direccion) {
            case NORTE -> "Avanzar hacia el norte";
            case SUR -> "Retroceder hacia el sur";
            case ESTE -> "Desplazarse hacia la derecha";
            case OESTE -> "Desplazarse hacia la izquierda";
        };

        IO.println("La accion tomada en base a tu direccion cardinal es: " + accion);
    }

    int pedirNumeroEntreCeroYDiezAUsuario() {
        int numero = -1;
        while (numero < 0 || numero > 10) {
            try {
                numero = Integer.parseInt(IO.readln());
            } catch (Exception enrique) {
                IO.println("Este numero no es valido, pruebe otro");
            }
        }
        return numero;
    }
}