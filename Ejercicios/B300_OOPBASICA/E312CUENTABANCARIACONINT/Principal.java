package B300_OOPBASICA.E312CUENTABANCARIACONINT;

public class Principal {
    void main() {
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta(100, true, 50);
        Cuenta c3 = c2.clone();

        IO.println("Cuentas: ");
        IO.println(c1);
        IO.println(c2);
        IO.println(c3);

        IO.println();

        IO.println("Equals: ");
        if (c1.equals(c2)) IO.println("cuenta 1 y cuenta 2 son iguales:");
        else IO.println("cuenta 1 y cuenta 2 no son iguales");
        if (c2.equals(c3)) IO.println("cuenta 2 y cuenta 3 son iguales:");
        else IO.println("cuenta 2 y cuenta 3 no son iguales");

        IO.println();

        IO.println("Hacer operaciones: ");
        IO.println("cuenta 1");
        c1.ingresarCajero(100);
        IO.println(c1);
        c1.cargarRecibo(99.99);
        IO.println(c1);

        IO.println();

        IO.println("cuenta 2");
        IO.println(c2);
        c2.cargarRecibo(149.99);
        IO.println(c2);

        IO.println();
        IO.println("cuenta 3");
        IO.println(c3);
        c3.extraerCajero(100);
        IO.println(c3);
        c3.cargarRecibo(50);
        IO.println(c3);
        c3.cargarRecibo(1); //da error porque maximo descubierto superado por uno
        IO.println(c3);

    }
}
