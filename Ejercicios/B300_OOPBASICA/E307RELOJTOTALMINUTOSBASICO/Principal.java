package B300_OOPBASICA.E307RELOJTOTALMINUTOSBASICO;

import B300_OOPBASICA.E305RELOJHMBASICO.Reloj;

public class Principal {
    void main() {
        B300_OOPBASICA.E305RELOJHMBASICO.Reloj reloj1 = new B300_OOPBASICA.E305RELOJHMBASICO.Reloj();
        B300_OOPBASICA.E305RELOJHMBASICO.Reloj reloj2 = new B300_OOPBASICA.E305RELOJHMBASICO.Reloj(150);
        B300_OOPBASICA.E305RELOJHMBASICO.Reloj reloj3 = new B300_OOPBASICA.E305RELOJHMBASICO.Reloj(3, 45);

        System.out.println(reloj1);
        System.out.println(reloj2);
        System.out.println(reloj3);

        reloj1.tick();

        reloj1.sumarMinutos(80);

        System.out.println("Tras tick y sumar unos pocos minutos: " + reloj1);

        reloj1.restarMinutos(20000);

        System.out.println("Restado muchos minutos: " + reloj1);

        int diferenciaMinutos = reloj2.diferenciaMinutos(reloj3);

        System.out.println("Diferencia en minutos entre reloj2 y reloj3: " + diferenciaMinutos);

        Reloj difReloj = reloj2.diferenciaReloj(reloj3);

        System.out.println("Diferencia en Reloj entre reloj2 y reloj3: " + difReloj);
    }
}

