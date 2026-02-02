package B300_OOPBASICA.E304CONTADORCONMINMAXCONFIGURABLES;

public class Principal {
    void main() {
        Contador c1 = new Contador(50, 5, 100, 10);

        IO.println(c1);
        c1.setValor(c1.getValorMax() + 1);
        IO.println(c1);
        c1.setValorMax(50);
        IO.println(c1);
        c1.incrementar();
        IO.println(c1);
        c1.decrementar(100);
        IO.println(c1);
    }
}
