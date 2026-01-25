package B300_OOPBASICA.E306RELOJCOMPLETOEQUALSCLONE;

public class Principal {
    void main() {
        Reloj r1 = new Reloj();
        Reloj r2 = r1;
        Reloj r3 = new Reloj(120);
        Reloj r4 = r3.clone();

        String respuesta = "";
        IO.println("Comparacion relojes mismo objeto");
        respuesta = (r1.equals(r2)) ? "Son iguales" : "No son iguales";
        IO.println();

        IO.println("Comparacion relojes distintos objetos hora distinta");
        respuesta = (r1.equals(r3)) ? "Son iguales" : "No son iguales";
        IO.println("Los dos relojes " + respuesta);
        IO.println();

        IO.println("Comparacion relojes distintos objetos misma hora");
        respuesta = (r3.equals(r4)) ? "Son iguales" : "No son iguales";
        IO.println("Los dos relojes " + respuesta);
        IO.println();
    }
}


