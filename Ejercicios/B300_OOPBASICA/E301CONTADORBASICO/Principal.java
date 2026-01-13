package B300_OOPBASICA.E301CONTADORBASICO;

public class Principal {
    static void main() {
        Contador c1 = new Contador(99);
        Contador c2 = new Contador();
        Contador c3 = new Contador(55, "Manzanas");


        c1.setValor(5000);
        c1.incrementar();
        IO.println(c1);

        c1.decrementar();
        IO.println(c1);

        c1.decrementar();
        IO.println(c1);

        IO.println(c2);

        c2.incrementar();
        IO.println(c2);

        IO.println(c3);
    }
}